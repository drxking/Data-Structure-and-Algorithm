package OddOrEven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int input = s1.nextInt();
        s1.close();
        if(input % 2 == 0){
            System.out.println("The number " + input + " is Even");
        }else{
            System.out.println("The number " + input + " is Odd");
        }
    }
}
