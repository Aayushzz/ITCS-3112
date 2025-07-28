package Assgn3.Task1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance > amount){
            balance -=amount;
        }else {
            System.out.println("Insufficient funds");
        }    
    }
}
