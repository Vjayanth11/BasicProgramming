package objectorientation.bankingsystem;

abstract class Account {
    private double balance;
    private Customer customer;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    public abstract double calculateInterest();
}