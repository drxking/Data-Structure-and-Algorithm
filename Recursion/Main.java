package Recursion;

public class Main {
    public static void main(String[] args) {
        Recursion r1 = new Recursion();
        for(int i = 0;i<=10;i++){
            System.out.println(r1.fabonacci(i));
        }
        System.out.println("Factorial of 10 is " + r1.factorial(10));
    }
}
