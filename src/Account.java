/**
 * Created by dtoy on 01.10.2016.
 */
public class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) {

        this.balance -= amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}
