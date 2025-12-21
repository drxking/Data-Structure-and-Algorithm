package Encapsulation.Encapsul;



public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Ekta Pokharel", 1234567890);
        b1.setBalance(500000000);
        System.out.println(b1.getBalance());
    }
}
