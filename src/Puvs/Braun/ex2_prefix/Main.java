package Puvs.Braun.ex2_prefix;

import Puvs.Braun.ex2_prefix.parallel.PrefixParallelUsingExecutorService;
import Puvs.Braun.ex2_prefix.sequential.PrefixSequential;
import Puvs.Braun.util.Measurement;
import Puvs.Braun.util.SpeedUp;

public class Main
{
    private static final int ARRAY_SIZE = 10000000;

    public static void main( final String[] args )
    {
        System.out.println("Anzahl Kerne: "+Runtime.getRuntime( ).availableProcessors( ));
        final long sequential = prefixSequential( );
        final long parallel = prefixUsingExecutorService( );
        System.out.println( "Speed-up: " + SpeedUp.speedup( sequential, parallel ) );
        System.exit(-1);
    }

    private static long prefixSequential( )
    {
        final PrefixSequential s = new PrefixSequential( ARRAY_SIZE );
        final Measurement measurement = new Measurement( 200, s );
        measurement.call( );

        System.out.println( "Sequential Result in " + measurement.getDuration( ) + " ns" );
        return measurement.getDuration( );
    }

    private static long prefixUsingExecutorService( )
    {
        final PrefixParallelUsingExecutorService p = new PrefixParallelUsingExecutorService( ARRAY_SIZE );
        final Measurement measurement = new Measurement( 20, p );
        measurement.call( );

        System.out.println( "Parallel Result in " + measurement.getDuration( ) + " ns" );
        return measurement.getDuration( );
    }
}
