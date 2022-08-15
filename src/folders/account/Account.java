package folders.account;

public class Account {

    private String name;
    private double balance;

    Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) this.balance = balance;
    }

    public static void displayAccount(Account account) {
        System.out.printf("name: %s, balance: %.2f", account.getName(), account.getBalance());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= balance) balance -= withdrawalAmount;
        else System.out.println("Withdrawal amount exceeded folders.account balance.");
    }

}
