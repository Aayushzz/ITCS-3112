package Assgn3.Task1;

public class BankAccount {
    private int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public int getaccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + "\nBalance: $" + balance);
    }
}
