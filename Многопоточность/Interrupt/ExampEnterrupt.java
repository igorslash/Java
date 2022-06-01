package Многопоточность.Interrupt;

public class ExampEnterrupt {
    public static void main(String[] args) {
        Main m = new Main("D", 4);
        Main m2 = new Main("G", 5);
        m.setThread(m2);
        m2.setThread(m);
        m.setName("D");
        m2.setName("G");
        m.start();
        m2.start();
    }
}
class Main extends Thread {
    private final int count;
    private final String word;
    private Thread thread;

    public void setThread(Thread thread) {
        this.thread = thread;

    }
    Main(String word, int count) {
        this.count = count;
        this.word = word;
    }

    @Override
    public void run() {
        while (!interrupted()) {//проверяет хотят ли прервать поток или нет
            thread.interrupt();
            for (int i = 0; i < count; i++) {
                System.out.println(word + i);
            }
        }
    }
}