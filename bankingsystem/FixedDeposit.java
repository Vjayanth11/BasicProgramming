package objectorientation.bankingsystem;

class FixedDeposit extends Account {
    public FixedDeposit(Customer customer, double balance) {
        super(customer, balance);
    }

    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from Fixed Deposit");
    }

    public double calculateInterest() {
        return 0.07;
    }
}
