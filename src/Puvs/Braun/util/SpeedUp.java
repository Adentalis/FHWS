package Puvs.Braun.util;

public class SpeedUp
{
    public static double speedup( final long sequentialTime, final long parallelTime )
    {
        return ( ( double ) sequentialTime ) / parallelTime;
    }
}
