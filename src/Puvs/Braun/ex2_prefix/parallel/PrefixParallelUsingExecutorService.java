package Puvs.Braun.ex2_prefix.parallel;

import Puvs.Braun.ex2_prefix.sequential.PrefixSequentialWorker;
import Puvs.Braun.util.InitializeArray;
import Puvs.Braun.util.MeasuredCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class PrefixParallelUsingExecutorService extends MeasuredCallable
{
    private static final int NUMBER_OF_PARALLEL_THREADS = Runtime.getRuntime( ).availableProcessors( );
    private static final int NUMBER_OF_CHUNKS = Runtime.getRuntime( ).availableProcessors( );

    private final int arraySize;
    private int[] array;

    private final ExecutorService executorService;

    public PrefixParallelUsingExecutorService( final int arraySize )
    {
        this.arraySize = arraySize;
        this.executorService = Executors.newFixedThreadPool( NUMBER_OF_PARALLEL_THREADS );
    }

    public Integer call( )
    {
        final int[] prefixSumOfChunks = phaseOneForPrefixInChunks( );
        final int[] exclusivePrefixSumOfPrefixSums = phaseTwoForPrefixSumOfPrefixSums( prefixSumOfChunks );

        phaseThreeForAddDeltaToPrefixSumInChunks( exclusivePrefixSumOfPrefixSums );

        return lastElementOfArray( );
    }

    @Override public void initializeData( )
    {
        this.array = InitializeArray.initializeArrayParallelWithRandomValues( this.arraySize );
    }

    private int lastElementOfArray( )
    {
        return this.array[ this.array.length - 1 ];
    }

    private int[] phaseOneForPrefixInChunks( )
    {
        final PrefixWorker[] workerForPrefix = createThreadsForPrefixInChunks( );
        return waitForAllThreadsToTerminate( submitThreads( workerForPrefix ) );
    }

    private int[] phaseTwoForPrefixSumOfPrefixSums( final int[] prefixSums )
    {
        final int[] shiftedRight = new int[ prefixSums.length ];

        System.arraycopy( prefixSums, 0, shiftedRight, 1, prefixSums.length - 1 );
        new PrefixSequentialWorker( shiftedRight ).call( );

        return shiftedRight;
    }

    private void phaseThreeForAddDeltaToPrefixSumInChunks( final int[] deltas )
    {
        final AddDeltaWorker[] workerForAddingDelta = createThreadsForAddingDelta( deltas );
        waitForAllThreadsToTerminate( submitThreads( workerForAddingDelta ) );
    }

    private int[] waitForAllThreadsToTerminate( final List<Future<Integer>> futures )
    {
        final int[] partialResults = new int[ futures.size( ) ];

        for ( int i = 0; i < partialResults.length; i++ )
        {
            try
            {
                partialResults[ i ] = futures.get( i ).get( );
            }
            catch ( final InterruptedException | ExecutionException e )
            {
                e.printStackTrace( );
            }
        }

        return partialResults;
    }

    private List<Future<Integer>> submitThreads(final Callable<Integer>[] threads )
    {
        final List<Future<Integer>> futures = new ArrayList<>( );
        for ( int i = 0; i < NUMBER_OF_CHUNKS; i++ )
        {
            futures.add( this.executorService.submit( threads[ i ] ) );
        }
        return futures;
    }

    private PrefixWorker[] createThreadsForPrefixInChunks( )
    {
        final PrefixWorker[] threads = new PrefixWorker[ NUMBER_OF_CHUNKS ];
        final float chunkSize = ( float ) this.array.length / NUMBER_OF_CHUNKS;

        for ( int i = 0; i < NUMBER_OF_CHUNKS; i++ )
        {
            final int from = from( i, chunkSize );
            final int size = size( i, chunkSize, from );
            threads[ i ] = new PrefixWorker( this.array, from, size );
        }
        return threads;
    }

    private AddDeltaWorker[] createThreadsForAddingDelta( final int[] delta )
    {
        final AddDeltaWorker[] threads = new AddDeltaWorker[ NUMBER_OF_CHUNKS ];
        final float chunkSize = ( float ) this.array.length / NUMBER_OF_CHUNKS;

        for ( int i = 0; i < NUMBER_OF_CHUNKS; i++ )
        {
            final int from = from( i, chunkSize );
            final int size = size( i, chunkSize, from );
            threads[ i ] = new AddDeltaWorker( this.array, from, size, delta[ i ] );
        }

        return threads;
    }

    private int from( final int chunk, final float chunkSize )
    {
        return Math.round( chunk * chunkSize );
    }

    private int size( final int chunk, final float chunkSize, final int fromIndex )
    {
        return Math.round( ( chunk + 1 ) * chunkSize ) - fromIndex;
    }
}
