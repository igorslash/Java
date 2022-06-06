package Training;

import java.util.ArrayList;
import java.util.List;

public class Java  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RunnableTimer());
       Thread thread1 = new Thread(new RunnableTimer2());
       thread.start();
       thread.join();
       thread1.start();
    }
}
class RunnableTimer implements java.lang.Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
class RunnableTimer2 implements java.lang.Runnable {
    @Override
    public void run() {
        List<Integer>list = new ArrayList<>();
        list.add(22);
        list.add(30);
        list.add(50);
        for (int i: list) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
