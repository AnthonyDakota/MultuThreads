import javax.naming.InsufficientResourcesException;

/**
 * Created by dtoy on 01.10.2016.
 */
public class Operations {
    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                transfer(a, b, 500);
            }
        }).start();
        transfer(b, a, 300);
    }

    static void transfer(Account acc1, Account acc2, int amount) {
        if (acc1.getBalance() < amount) {
            try {
                throw new InsufficientResourcesException();
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
        }
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }

}
