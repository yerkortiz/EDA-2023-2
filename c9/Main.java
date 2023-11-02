package c9;

import java.util.Arrays;

import c9.Sorting.Sorting;
import c9.Util.Util;

public class Main {
    public static void main(String[] args) {
        

        // int[] A = Util.generateRandomArray(3);
        int[] A = {5, 10, 7};
        Util.printArray(A);
        Sorting.countingSort(A, 3);
        Util.printArray(A);
        // long startTimeBS = System.nanoTime();
        // Sorting.quickSort(A, 0, A.length);
        // long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        // Arrays.sort(A);
        // long endTimeBS = System.nanoTime();
        // long timeElapsedBS = endTimeBS - startTimeBS;
        // Util.printArray(A);

        // System.out.println("Nanoseconds: " + timeElapsedBS);
        // System.out.println("Microseconds: " + timeElapsedBS / 1e3);
        // System.out.println("Milliseconds: " + timeElapsedBS / 1e6);
        // System.out.println("Seconds: " + timeElapsedBS / 1e9);

        // System.out.println("Used memory is bytes: " + memory);
        // System.out.println("Used memory is kilobytes: " + memory / 1e3);
        // System.out.println("Used memory is megabytes: " + memory / 1e6);
        // System.out.println("Used memory is gigabytes: " + memory / 1e9);
    }
}
