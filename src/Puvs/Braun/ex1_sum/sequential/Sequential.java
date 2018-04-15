package Puvs.Braun.ex1_sum.sequential;

import Puvs.Braun.util.MeasuredCallable;

public class Sequential extends MeasuredCallable
{
    private final int[] array;

    public Sequential( final int[] array )
    {
        this.array = array;
    }

    public Integer call( )
    {
        int sum = 0;

        for ( int i = 0; i < this.array.length; i++ )
        {
            sum += this.array[ i ];
        }

        return sum;
    }
}
