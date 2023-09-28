class Example {

    static void f1(int N){
        for(int i = 0; i < N; i++){
            System.out.println(i);
        }
    }

    static void f2(){
        for(int i = 0; i < 100; i++){
            f1(i);
        }
    }

    static void f3(int N){
        for(int i = 1; i < N; i = i*2){
            System.out.println(i);
        }
    }

    static void f4(int N){
        for(int i = 0; i < N/8; i++){
            System.out.println(i);
        }
    }

    static void f5(int N){
        for(int i = 1; i < N; i++){
            for(int j = 1; j < N; j++){
                System.out.println(i);
            }
        }
    }


    static void f6(int N){
        for(int i = 1; i < N; i++){
            for(int j = 1; j < N; j = j*2){ 
                System.out.println(i);
            }
        }
    }
}