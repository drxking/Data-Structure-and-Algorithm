package Recursion;

public class Main {
    public static void main(String[] args) {
        // Recursion r1 = new Recursion();
        for (int i = 0; i <= 10; i++) {
            System.out.println(Recursion.fabonacci(i));
        }
        System.out.println("Factorial of 10 is " + Recursion.factorial(10));
        System.out.println(Recursion.gcd(18, 48));
    }
}
