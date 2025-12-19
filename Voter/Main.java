package Voter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = s1.nextInt();
        s1.close();
        if (age > 97) {
            System.out.println("Fever Detected");
        }
        else if(age<40){
            System.out.println("You are dead");
        }
        else {
            System.out.println("You are Ok");
        }
    }
}
