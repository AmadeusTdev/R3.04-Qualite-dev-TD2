public class program {
    public static void main(String[] args) {
        Alphabet myAlphabet = new Alphabet();
        Count myCount = new Count();

        Thread thread1 = new Thread(myAlphabet);
        Thread thread2 = new Thread(myCount);
        thread1.start();
        thread2.start();
    }
}
