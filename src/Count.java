public class Count implements Runnable {
    @Override
    public void run() {
        // Implementation for the run method
        for (int i = 1; i <= 26; i++) {
            System.out.print(i + " ");
        }
    }
}
