import java.util.Scanner;
class Main {
    static Boolean example1(int N){
        if(N > 10) {
            return true;
        } 

        return false;
    }

    static void example2(int N){
        while(N > 1){
            if(N % 2 == 0){
                N = N/2;
            } else {
                N = 3 * N + 1;
            }
            System.out.println(N);
        }
        System.out.println(N);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    }
}