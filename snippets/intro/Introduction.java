package intro;

class Introduction {
    int findMax(int[] A){
        int max = A[0];
        for(int i=1; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}