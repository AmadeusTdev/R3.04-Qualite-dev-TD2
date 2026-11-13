public class JulietteAndRomeoJob implements Runnable {
    private String name;
    private Account account;

    public JulietteAndRomeoJob(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void doWithdraw(int amount) {
        try {
            System.out.println(name + " is trying to withdraw " + amount + " and the current balance is " + account.getBalance());
            if (account.getBalance() >= amount) {
                Thread.sleep(500);
                System.out.println(name + " is withdrawing " + amount);
                account.withdraw(amount);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        // Implementation for Juliette and Romeo's job
        for (int i = 0; i < 10; i++) {
            doWithdraw(10);
        }
    }

    public static void main(String[] args) {
        Account sharedAccount = new Account();

        JulietteAndRomeoJob romeoJob = new JulietteAndRomeoJob("Romeo", sharedAccount);
        JulietteAndRomeoJob julietteJob = new JulietteAndRomeoJob("Juliette", sharedAccount);

        Thread romeo = new Thread(romeoJob);
        Thread juliette = new Thread(julietteJob);

        romeo.start();
        juliette.start();
    }
}
