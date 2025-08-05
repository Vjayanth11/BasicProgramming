package objectorientd.bankingSystem;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 10000 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed for SavingsAccount.");
        }
    }
}
