package Многопоточность.Synhronization;

public class DataRaceSynhronized {
    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        Thread thread = new Thread(example);
        Thread thread1 = new Thread(example);
        thread.start();
        thread.join();
        thread1.start();
    }
}
class Counter {
    static int count = 0;
    }

class Example  implements Runnable{
    public synchronized void icrement() {//synchronized
        Counter.count++;
        System.out.println(Counter.count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            icrement();
        }
    }
}