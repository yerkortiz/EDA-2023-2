package heap;

public class MaxHeap {
    private int[] heap; // array 
    private int size;
    private int maxSize; // array size

    public MaxHeap(int maxSize) {
            this.maxSize = maxSize;
            this.size = 0;
            this.heap = new int[this.maxSize + 1];
            this.heap[0] = Integer.MAX_VALUE; 
    }

    private int parent(int i){
        return i / 2;
    }

    private int left(int i){
        return 2 * i;
    }

    private int right(int i){
        return 2 * i + 1;
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }


    private void maxHeapify(int i){
        int l = left(i);
        int r = right(i);
        int largest = heap[i];

        if (l <= size && heap[l] > heap[i]) {
            largest = l;
        }

        if (r <= size && heap[r] > heap[largest]) {
            largest = r;
        }

        if (largest != i){
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    public int maximum() throws Exception{
        if (size < 1){
            throw new Exception("error: heap underflow");
        }

        return heap[1];
    }

    public int extractMax(){
        int max = Integer.MIN_VALUE;
        try {
             max = maximum();
        } catch(Exception e) {
            e.printStackTrace();
        }

        heap[1] = heap[size];
        size--;
        maxHeapify(1);
        return max;
    }

    private void increaseKey(int i) {
        int temp = heap[i];
        while(i>1 && temp > heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }

    public void insert(int k) {
        size++;
        heap[size] = k; 
        increaseKey(size);
    }
}
