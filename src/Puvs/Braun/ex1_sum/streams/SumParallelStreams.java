package Puvs.Braun.ex1_sum.streams;

import Puvs.Braun.util.MeasuredCallable;

import java.util.Arrays;

public class SumParallelStreams extends MeasuredCallable
{
    private final int[] array;

    public SumParallelStreams( final int[] array )
    {
        this.array = array;
    }

    @Override
    public Integer call( )
    {
        return Arrays.stream( this.array ).parallel( )
                .reduce( 0, ( a, b ) -> a + b );
    }
}
