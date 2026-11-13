public class Alphabet implements Runnable {
    @Override
    public void run() {
        // Implementation for the run method
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}
