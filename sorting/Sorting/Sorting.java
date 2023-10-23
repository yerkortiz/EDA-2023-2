package sorting.Sorting;

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

    static void mergeSort(int[] arr, int lo, int hi) { 
        if(lo >= hi) { 
            return; 
        }
        int q = (lo + hi)/2;
        mergeSort(arr, lo, q); 
        mergeSort(arr, q + 1, hi);
        merge(arr, lo, (lo + hi) / 2, hi); 
    }

    // O(N)
    static void merge(int array[], int p, int q, int r) {

        int n1 = q - p + 1; // mid - lo + 1
        int n2 = r - q; // hi - mid
    
        int L[] = new int[n1];
        int M[] = new int[n2];
    
        for (int i = 0; i < n1; i++)
          L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
          M[j] = array[q + 1 + j];
    
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
    
        while (i < n1 && j < n2) {
          if (L[i] <= M[j]) {
            array[k] = L[i];
            i++;
          } else {
            array[k] = M[j];
            j++;
          }
          k++;
        }
    
        while (i < n1) {
          array[k] = L[i];
          i++;
          k++;
        }
    
        while (j < n2) {
          array[k] = M[j];
          j++;
          k++;
        }
      }

    static void quickSort(int []A, int p, int r) {
      if(p >= r) return;
      int q = partitioning(A, p, r);
      quickSort(A, p, q - 1);
      quickSort(A, q + 1, r);
    }

    static int partitioning(int []A, int p, int r) {
      int q = r;
      for(int u = p; u < r; u++){
        if(A[q] >= A[u]){
          int temp = A[u];
          A[u] = A[p];
          A[p] = temp;
          p++;
        }
      }

      int temp = A[q];
      A[q] = A[p];
      A[p] = temp;
      return p;
    }

    static void heapSort(int []A, int N) {

    }

    static void countingSort(int []A, int N) {

    }
}
