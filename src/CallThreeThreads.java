public class CallThreeThreads implements Runnable {
    @Override
    public void run() {
        PrintNameThread thread1 = new PrintNameThread("George");
        PrintNameThread thread2 = new PrintNameThread("Augustin");
        PrintNameThread thread3 = new PrintNameThread("Tasty");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin des 3 threads");
    }
}
