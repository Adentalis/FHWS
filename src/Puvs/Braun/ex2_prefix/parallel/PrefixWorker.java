package Puvs.Braun.ex2_prefix.parallel;

import java.util.concurrent.Callable;

public class PrefixWorker implements Callable<Integer>
{
    protected final int[] array;
    protected int size;
    protected int start;

    public PrefixWorker( final int[] array, final int start, final int size )
    {
        this.array = array;
        this.start = start;
        this.size = size;
    }

    @Override
    public Integer call( )
    {
        final int end = this.start + this.size;
        for ( int i = this.start + 1; i < end; i++ )
        {
            this.array[ i ] = this.array[ i - 1 ] + this.array[ i ];
        }

        return this.array[ this.start + this.size - 1 ];
    }
}
