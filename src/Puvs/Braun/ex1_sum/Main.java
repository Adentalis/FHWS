package Puvs.Braun.ex1_sum;


import Puvs.Braun.ex1_sum.executor.SumParallelUsingExecutorService;
import Puvs.Braun.ex1_sum.forkjoin.SumParallelUsingForkJoin;
import Puvs.Braun.ex1_sum.sequential.Sequential;
import Puvs.Braun.ex1_sum.streams.SumParallelStreams;
import Puvs.Braun.util.InitializeArray;
import Puvs.Braun.util.Measurement;
import Puvs.Braun.util.SpeedUp;

public class Main
{
    private static final int ARRAY_SIZE = 20000000;

    private static final int[] ARRAY = InitializeArray.initializeArrayParallelWithRandomValues( ARRAY_SIZE );

    public static void main( final String[] args ) throws Exception
    {
        final long sequentialTime = sumSequential( );
        final long parallelTime =sumParallelUsingExecutorService( );
        //final long parallelTime = sumParallelUsingForkJoin( );
        //final long parallelTime = sumParallelUsingStream( );
        System.out.println( "Speed-up: " + SpeedUp.speedup( sequentialTime, parallelTime ) );
    }

    private static long sumSequential( ) throws Exception
    {
        final Sequential s = new Sequential( ARRAY );
        final Measurement measurement = new Measurement( 100, s );

        System.out.println( "Sequential Result: " + measurement.call( ) + " in " + measurement.getDuration( ) + " ns" );
        return measurement.getDuration( );
    }

    private static long sumParallelUsingExecutorService( )
    {
        final SumParallelUsingExecutorService s = new SumParallelUsingExecutorService( ARRAY );
        final Measurement measurement = new Measurement( 100, s );

        System.out.println(
                "Parallel Executor Result: " + measurement.call( ) + " in " + measurement.getDuration( ) + " ns" );
        return measurement.getDuration( );
    }

    private static long sumParallelUsingForkJoin( ) throws Exception
    {
        final SumParallelUsingForkJoin s = new SumParallelUsingForkJoin( ARRAY );
        final Measurement measurement = new Measurement( 100, s );

        System.out.println(
                "Parallel Fork/Join Result: " + measurement.call( ) + " in " + measurement.getDuration( ) + " ns" );
        return measurement.getDuration( );

    }

    private static long sumParallelUsingStream( )
    {
        final SumParallelStreams s = new SumParallelStreams( ARRAY );
        final Measurement measurement = new Measurement( 100, s );

        System.out.println(
                "Parallel Stream Result: " + measurement.call( ) + " in " + measurement.getDuration( ) + " ns" );
        return measurement.getDuration( );
    }

}
