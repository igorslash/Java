package Java;

import java.util.ArrayList;
import java.util.List;

public class Java {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Thread thread = new Thread(new RunnableTimer());
       Thread thread1 = new Thread(new RunnableTimer2());
       thread.start();
       thread.setPriority(1);
       thread.join();
       thread1.start();

    }
}
class RunnableTimer implements java.lang.Runnable {
    public RunnableTimer() {}

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            try {
                wait(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
            notify();
        }
    }
}
class RunnableTimer2 extends RunnableTimer implements java.lang.Runnable {
    public RunnableTimer2() {}

    @Override
    public synchronized void run() {
        List<Integer>list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        for (int i: list) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
