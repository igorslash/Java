package Многопоточность;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Java {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
       executor.submit(new RunnableTimer());
       executor.execute(new RunnableTimer2());
       DaemonThread daemon = new DaemonThread();
       daemon.start();
       daemon.join();
       executor.shutdown();
    }
}
class RunnableTimer implements java.lang.Runnable {
    public RunnableTimer() {}

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class RunnableTimer2 extends RunnableTimer implements java.lang.Runnable {
    public RunnableTimer2() {}

    @Override
    public void run() {
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
        System.out.println("finish");
        System.out.println(Thread.currentThread().getName());
    }
}
class DaemonThread extends Thread implements Runnable {
    @Override
    public  void run() {
        try {
            if (!isDaemon()) {
                System.out.println("Start daemon");
                sleep(1000);
            }else {
                System.out.println("Start обычного потокa");
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!interrupted()) {
            System.out.println("stop");
        }
    }
}


