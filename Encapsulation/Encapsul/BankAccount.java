package Encapsulation.Encapsul;

class BankAccount {
    private double balance;
    String name;
    long accountNumber;

    BankAccount(String name, long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void setBalance(double amount) {
        if (amount > 0 && amount < 500000) {
            this.balance = amount;
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public double getBalance() {
        return this.balance;
    }

}