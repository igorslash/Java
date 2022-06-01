package Многопоточность.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        SimpleCountThread[] counterThread = new SimpleCountThread[10];

        fillingArrayOfThread(c, counterThread);//ctrl + alt + M создаёт переменную

        fillingEachThread(counterThread);

        joinEveryThread(counterThread);

        System.out.println(c.getCount());
    }

    private static void joinEveryThread(SimpleCountThread[] counterThread) throws InterruptedException {
        for (SimpleCountThread simpleCountThread: counterThread) {
            simpleCountThread.join();
        }
    }

    private static void fillingArrayOfThread(Count c, SimpleCountThread[] counterThread) {
        for (int i = 0; i < 10; i++) {
            counterThread[i] = new SimpleCountThread(c, 1000);
        }
    }
    private static void fillingEachThread(SimpleCountThread[] counterThread) {
        for (SimpleCountThread simpleCountThread: counterThread) {
            simpleCountThread.start();
        }
    }
}
class Count {
    private long count = 0;
    Lock lock = new ReentrantLock();

    public void countIncrementValue() {
        lock.lock();
        try {
            count++;
        }finally {
         lock.unlock();
        }
    }
    public long getCount() {
        return count;
    }
}
class SimpleCountThread extends Thread {
    private final Count count;
    private final int num;

    public SimpleCountThread(Count count, int num) {
        this.count = count;
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            count.countIncrementValue();
        }
    }
}