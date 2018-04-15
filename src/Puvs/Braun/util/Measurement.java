package Puvs.Braun.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Measurement
{
    private final int numberOfReps;

    private final List<Long> listOfMeasurementResults;

    private final MeasuredCallable measuredCallable;

    public Measurement( final MeasuredCallable measuredCallable )
    {
        this( 1, measuredCallable );
    }

    public Measurement( final int numberOfReps, final MeasuredCallable measuredCallable )
    {
        this.listOfMeasurementResults = new LinkedList<>( );
        this.numberOfReps = numberOfReps;
        this.measuredCallable = measuredCallable;
    }

    public final Integer call( )
    {
        try
        {
            IntStream.range( 0, this.numberOfReps ).forEach( i -> _callWithMeasurement( ) );
            return this.measuredCallable.call( );
        }
        catch ( final Exception e )
        {
            e.printStackTrace( );
            return 0;
        }
    }

    public final long getDuration( )
    {
        return Math.round( this.listOfMeasurementResults.stream( )
                .mapToDouble( i -> i )
                .average( )
                .getAsDouble( ) );
    }

    public List<Long> getListOfMeasurementResults( )
    {
        return Collections.unmodifiableList( listOfMeasurementResults );
    }

    private Integer _callWithMeasurement( )
    {
        try
        {
            /* Intialization of data is done before time measurements starts. */
            this.measuredCallable.initializeData( );
            final long start = System.nanoTime( );
            final int result = this.measuredCallable.call( );
            addDurationToListOfMeasurements( System.nanoTime( ) - start );
            return result;
        }
        catch ( final Exception e )
        {
            e.printStackTrace( );
            return 0;
        }
    }

    private void addDurationToListOfMeasurements( final long duration )
    {
        if ( duration >= 0 )
        {
            this.listOfMeasurementResults.add( duration );
        }
    }
}
