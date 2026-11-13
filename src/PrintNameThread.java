import java.util.Random;

public class PrintNameThread implements Runnable {
    private final Random random = new Random();
    private String name;

    public PrintNameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<=10; i++) {
            try {
                int duree = random.nextInt(201);
                Thread.sleep(duree);
                System.out.println("Hello, " + name + "!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
