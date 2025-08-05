package objectorientd.bankingSystem;

public class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printStatement() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

