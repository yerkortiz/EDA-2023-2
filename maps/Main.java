package maps;

import java.util.HashMap;

import javax.swing.RowFilter.Entry;

public class Main {
    static void KFrecuentElements(int []A, int k) {
        // instancio un hashmap para guardar las frecuencias
        HashMap<Integer, Integer> hm = new HashMap<>();
        // recorro el arreglo de izquierda a derecha
        for(int i = 0; i < A.length; i++) {
            // se verifica si la key está en el mapa
            if(hm.containsKey(A[i])) {
                //dado que está en el mapa, ahora se actualiza el contador + 1
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                // caso contrario agrego la key al mapa con valor 1
                hm.put(A[i], 1);
            }
        }

        // itero en el mapa
        // ingreso los elementos en un maxHeap
        // donde este maxHeap prioriza los elementos por su frecuencia
        // extraigo K elementos del heap, esos elementos son los K elementos
        // más frecuentes
    }
    public static void main(String[] args) {
        int []A = new int[]{5, 10, 5, 10, 20, 30, 25, 5};
        KFrecuentElements(A, 2);
    }
}
