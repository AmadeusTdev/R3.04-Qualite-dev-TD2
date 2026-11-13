public class program {
    public static void main(String[] args) {
        // 3. Threads et JVM
        Alphabet myAlphabet = new Alphabet();
        Count myCount = new Count();

        Thread thread1 = new Thread(myAlphabet);
        Thread thread2 = new Thread(myCount);
        thread1.start();
        thread2.start();

        // 4. Méthodes de la classe Thread
        CallThreeThreads callThreeThreads = new CallThreeThreads();
        Thread thread3 = new Thread(callThreeThreads);
        thread3.start();

        // 5. Threads et concurrence
        
    }
}
