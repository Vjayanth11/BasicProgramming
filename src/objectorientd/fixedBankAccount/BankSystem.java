package objectorientd.fixedBankAccount;

public class BankSystem {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        accounts[0] = new Account("kharghe", 1000);
        accounts[1] = new Account("dk shivkumar", 1500);
        accounts[0].deposit(500);
        accounts[1].withdraw(200);
        accounts[0].transfer(accounts[1], 300);
        accounts[0].showDetails();
        accounts[1].showDetails();
    }
}
