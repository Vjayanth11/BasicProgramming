package objectorientd.bankingSystem;

public class Bank {
    public void createAndRun() {
        SavingsAccount sa = new SavingsAccount(1001, 5000);
        CurrentAccount ca = new CurrentAccount(2001, 3000, 2000);

        Customer c1 = new Customer("Swathi", sa);
        Customer c2 = new Customer("Jayanth", ca);

        c1.performDeposit(2000);
        c1.performWithdrawal(3000);
        c1.showStatement();

        System.out.println();

        c2.performWithdrawal(4000);
        c2.showStatement();
    }
}

