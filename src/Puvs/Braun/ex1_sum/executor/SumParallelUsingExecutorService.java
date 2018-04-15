package Puvs.Braun.ex1_sum.executor;

import Puvs.Braun.util.MeasuredCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumParallelUsingExecutorService extends MeasuredCallable
{
    private static final int NUMBER_OF_PARALLEL_THREADS = Runtime.getRuntime( ).availableProcessors( );
    private static final int NUMBER_OF_CHUNKS = Runtime.getRuntime( ).availableProcessors( );

    private final int[] array;

    private final ExecutorService executorService;

    public SumParallelUsingExecutorService( final int[] array )
    {
        this.array = array;
        this.executorService = Executors.newFixedThreadPool( NUMBER_OF_PARALLEL_THREADS );
    }

    public Integer call( )
    {
        final SumWorker[] workers = createThreadsForChunks( );
        return waitForAllThreadsToTerminate( submitThreads( workers ) );
    }

    private SumWorker[] createThreadsForChunks( )
    {
        final SumWorker[] threads = new SumWorker[ NUMBER_OF_CHUNKS ];
        final float chunkSize = ( float ) this.array.length / NUMBER_OF_CHUNKS;

        for ( int i = 0; i < NUMBER_OF_CHUNKS; i++ )
        {
            final int from = Math.round( i * chunkSize );
            final int size = Math.round( ( i + 1 ) * chunkSize ) - from;
            threads[ i ] = new SumWorker( this.array, from, size );
        }
        return threads;
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

    private int waitForAllThreadsToTerminate( final List<Future<Integer>> futures )
    {
        int returnValue = 0;

        for ( final Future<Integer> f : futures )
        {
            try
            {
                returnValue += f.get( );
            }
            catch ( final InterruptedException | ExecutionException e )
            {
                e.printStackTrace( );
            }
        }

        return returnValue;
    }

}
