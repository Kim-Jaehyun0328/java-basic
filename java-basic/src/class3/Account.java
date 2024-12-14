package class3;

public class Account {
    int balance;


    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(balance < amount) {
            System.out.println("잔고 부족");
            System.out.println("잔고: " + balance);
        } else {
            balance -= amount;
        }
    }
}
