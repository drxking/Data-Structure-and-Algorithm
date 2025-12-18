package Threads;

public class Main {

    static int SI(int P, int T, int R) {
        return (P * T * R) / 100;
    }

    static int square(int a){
        return 16;
    }

    static int cube(int a ){
        return a*a*a;
    }


    public static void main(String[] args) {
        int simple = Main.SI(100000, 1, 10);
        System.out.println(simple);


        System.out.println(Main.square(4));
        System.out.println(Main.cube(4));
    }
}
