package objectorientd.bankingSystem;

public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void performDeposit(double amount) {
        account.deposit(amount);
    }

    public void performWithdrawal(double amount) {
        account.withdraw(amount);
    }

    public void showStatement() {
        System.out.println("Customer: " + name);
        account.printStatement();
    }
}

