package objectorientation.bankingsystem;

public class MainBank {
    public static void main(String[] args) {
        Customer c = new Customer("Ravi");
        Account a1 = new SavingsAccount(c, 1000);
        Account a2 = new CurrentAccount(c, 2000);
        Account a3 = new FixedDeposit(c, 5000);

        a1.withdraw(100);
        a2.withdraw(200);
        a3.withdraw(300);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());
        System.out.println("FD Interest: " + a3.calculateInterest());
    }
}
