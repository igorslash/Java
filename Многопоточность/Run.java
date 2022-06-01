package Многопоточность;

public class Run implements Runnable {
    private String word;
    private int delay;

    public Run(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }
    @Override
    public void run() {
        for (;;) {
            System.out.println(word + "");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
    public static void main(String[] args) {
        Run ping = new Run("Hello", 2);
        Run pong = new Run("Pong", 4);
        Thread t = new Thread(ping);
        Thread t2 = new Thread(pong);
        t.start();
        t2.start();
    }
}
