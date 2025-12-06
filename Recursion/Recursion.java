package Recursion;

public class Recursion {
    public int fabonacci(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;
        return this.fabonacci(num-1) + this.fabonacci(num-2);
    }

    public int factorial(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;
        return num * this.factorial(num-1);
    }
}
