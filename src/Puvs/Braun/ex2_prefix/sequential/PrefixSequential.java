package Puvs.Braun.ex2_prefix.sequential;

import Puvs.Braun.util.InitializeArray;
import Puvs.Braun.util.MeasuredCallable;

public class PrefixSequential extends MeasuredCallable
{
    private final int arraySize;
    private int[] array;

    public PrefixSequential( final int arraySize )
    {
        this.arraySize = arraySize;
    }

    public Integer call( )
    {
        return new PrefixSequentialWorker( this.array ).call( );
    }

    @Override public void initializeData( )
    {
        this.array = InitializeArray.initializeArrayParallelWithRandomValues( this.arraySize );
    }
}
