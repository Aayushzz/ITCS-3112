package Assgn3.Task1;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(int accountNumber, double balance) {
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
