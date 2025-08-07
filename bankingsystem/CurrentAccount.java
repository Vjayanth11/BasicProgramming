package objectorientation.bankingsystem;

class CurrentAccount extends Account {
    public CurrentAccount(Customer customer, double balance) {
        super(customer, balance);
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw from Current Account");
    }

    public double calculateInterest() {
        return 0.0;
    }
}
