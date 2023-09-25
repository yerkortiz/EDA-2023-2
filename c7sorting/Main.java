package c7sorting;

import c7sorting.Util.Util;
import c7sorting.Sorting.Sorting;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] A = Util.generateRandomArray(10000000);
        Sorting.bubbleSort(A, A.length);

        long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("Nanoseconds: " + timeElapsed);
        System.out.println("Microseconds: " + timeElapsed / 1e3);
        System.out.println("Milliseconds: " + timeElapsed / 1e6);
        System.out.println("Seconds: " + timeElapsed / 1e9);

        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is kilobytes: " + memory / 1e3);
        System.out.println("Used memory is megabytes: " + memory / 1e6);
        System.out.println("Used memory is gigabytes: " + memory / 1e9);
    }
}
