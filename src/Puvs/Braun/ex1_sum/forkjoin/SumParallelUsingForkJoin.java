package Puvs.Braun.ex1_sum.forkjoin;


import Puvs.Braun.util.MeasuredCallable;

import java.util.concurrent.ForkJoinPool;

public class SumParallelUsingForkJoin extends MeasuredCallable
{
    private final int[] array;

    private final ForkJoinPool forkJoinPool;

    public SumParallelUsingForkJoin( final int[] array )
    {
        this.array = array;
        this.forkJoinPool = new ForkJoinPool( );
    }

    public Integer call( )
    {
        return this.forkJoinPool.invoke( new SumForkJoinWorker( this.array, 0, this.array.length ) );
    }
}
