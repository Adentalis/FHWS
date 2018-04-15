package Puvs.Braun.ex2_prefix.sequential;

import java.util.concurrent.Callable;

public class PrefixSequentialWorker implements Callable<Integer>
{
    private final int[] array;

    public PrefixSequentialWorker( final int[] array )
    {
        this.array = array;
    }

    public Integer call( )
    {
        for ( int i = 1; i < this.array.length; i++ )
        {
            this.array[ i ] = this.array[ i - 1 ] + this.array[ i ];
        }

        return this.array[ this.array.length - 1 ];
    }
}
