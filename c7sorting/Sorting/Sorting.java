package c7sorting.Sorting;

public class Sorting {
    public static void bubbleSort(int []A, int N) {
        int temp;
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++){ 
                if(A[j] > A[j+1]) {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int []A, int N) {
        int temp;
        for(int i = 0; i < N - 1; i++) {
            int min = i;
            for(int j = i + 1; j < N; j++) {
                if(A[j] < A[min]) {
                    min = j;
                }
            }
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }

    public static void insertionSort(int []A, int N) {
        int key;
        for(int i = 1; i < N; i++) {
            key = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }

    static void mergeSort(int []A, int N) {

    }

    static void quickSort(int []A, int N) {

    }

    static void heapSort(int []A, int N) {

    }

    static void countingSort(int []A, int N) {

    }
}
