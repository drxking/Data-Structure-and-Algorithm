package Recursion;

public class Recursion {
    public static int fabonacci(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        return fabonacci(num - 1) + fabonacci(num - 2);
    }

    public static int factorial(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        return num * factorial(num - 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
