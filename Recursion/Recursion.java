package recursion;

public class Recursion {

    static void printArray(int []A, int N, int i){
        // for(int i = 0; i < N; i++){
        //     System.out.printf("%d\n", A[i]);
        // }
        if (i == N){
            return;
        }
        // System.out.printf("%d\n", A[i]);
        printArray(A, N, i + 1);
        System.out.printf("%d\n", A[i]);
    }

    static void binary(int N){
        if(N == 0) return;
        binary(N / 2);
        System.out.printf("%d ", N % 2);
    }

    static int fib(int N){
        if(N == 0) return 1;
        if(N == 1) return 1;
        return (fib(N - 1) + fib(N - 2));
    }
    public static void main(String []args){
        // int A[] = {1, 2, 3};
        // printArray(A, 3, 0);
        binary(8);
    }
}
