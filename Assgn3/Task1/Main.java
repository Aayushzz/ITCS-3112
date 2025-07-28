package Assgn3.Task1;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(123456, 500.0);
        SavingsAccount savingsAccount = new SavingsAccount(789012, 1000.0);
        
        // Perform deposit, withdrawal, and display balance operations
        checkingAccount.deposit(100.0);
        checkingAccount.withdraw(50.0);
        checkingAccount.displayBalance();

        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(1300);
        savingsAccount.displayBalance();
    }
}
