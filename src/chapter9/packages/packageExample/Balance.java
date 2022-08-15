package chapter9.packages.packageExample;

public class Balance {

    String name;
    double balance;

    Balance(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void show() {
        if (balance < 0) System.out.println("..>");
        System.out.println(name + " $ " + balance);
    }

}

class AccountBalance {
    public static void main(String[] args) {

        Balance user1 = new Balance("Hayk", 3000000);
        Balance user2 = new Balance("Ponch", 5000000);
        Balance user3 = new Balance("Manukyan", 400000);

        Balance []userArray = { user1, user2, user3 };

        for (Balance balance : userArray) {
            balance.show();
        }

    }
}
