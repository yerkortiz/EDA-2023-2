package search;
import java.util.Arrays;
class Search {
    static boolean linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    static int[] generateRandomArray(int N) {
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = (int)(Math.random() * N);
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000000);

        long startTime = System.nanoTime();
        System.out.println(linearSearch(arr, 50));
        long elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Linear Search: %d ns\n", elapsedTime);

        startTime = System.nanoTime();
        System.out.println(binarySearch(arr, 50));
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Binary Search: %d ns\n", elapsedTime);
    }
}