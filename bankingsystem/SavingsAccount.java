package objectorientation.bankingsystem;

class SavingsAccount extends Account {
    public SavingsAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw from Savings Account");
    }

    public double calculateInterest() {
        return 0.04;
    }
}
