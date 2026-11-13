public class Account {
    private int balance = 100;

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
}
