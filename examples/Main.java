// import java.util.Stack;
import java.util.Queue;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
public class Main{
    //input
    static void f1(int N){ // O(1)
        System.out.printf("%d ", N); 
    }

    static void f2(int N){ // O(N)
        // i va de 0 a N -> lineal 
        for(int i = 0; i < N; i++){ 
            f1(i); // 1
        }
    }

    //i = 1, 2, 4, 8, ..., N
    static void f3(int N){ // O(lg N)
        for(int i = 1; i < N; i *= 2){ // lg N
            f1(i); // 1
        }
    }

    static void f4(int N){ // N lg N
        for(int i = 1; i < N; i *= 2){ // lg N
            f2(i); // N
        }
    }

    static void f5(int N){ // O(max(lg N, N)) = O(N)
        for(int i = 1; i < N; i *= 2){ // lg N
            f1(i); // 1
        }

        f2(N); // N
    }

    // O(N)
    static void f6(int[] A, int N) { 
        Stack<Integer> st = new Stack<>(); // 1
        // Queue<Integer> q = new LinkedList<>();

        //O(N)
        for(int i = 0; i < N; i++){ // N
            st.push(A[i]); // 1
            // q.offer(A[i]); // 1
        }

        int i = 0;
        //O(N)
        while(!st.isEmpty()){ // N
            // A[i++] = q.poll(); // 1
            A[i++] = st.pop(); // 1
        }
    }

    static void printArray(int[] A, int N){ // O(N)
        for(int i = 0; i < N; i++){
            System.out.println(A[i]);
        }
    }

    /*
     * Listas Enlazadas
     * Insertar en posicion X
     * Eliminar elemento K
     * Encontrar Minimo, Maximo, Sucesor, Antecesor
     */

    /*
     * Parentesis Balanceado
     */
    public static void main(String[] args) {
        int[] A = new int[]{1, 2 ,5 ,8};
        // printArray(A, 4);
        f6(A, 4);
        printArray(A, 4);
    }
}