package Puvs.Braun.util;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class InitializeArray {
    public static int[] initializeArray(final int n) {
        final int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] initializeArrayParallel(final int n) {
        final int[] array = new int[n];
        Arrays.parallelSetAll(array, i -> i);
        return array;
    }

    public static int[] initializeArrayParallelWithRandomValues(final int n) {
        final int[] array = new int[n];
        Arrays.parallelSetAll(array, i -> ThreadLocalRandom.current().nextInt(0, 100));
        return array;

    }
}