package Многопоточность;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEnteger {
    static AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunneble());
        Thread thread1 = new Thread(new MyRunneble());
        thread1.start();
        thread.start();
        thread1.join();
        thread.join();
        System.out.println(count);
    }
    public static void increment() {
        count.incrementAndGet();
    }
}
class MyRunneble implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            AtomicEnteger.increment();
        }
    }
}