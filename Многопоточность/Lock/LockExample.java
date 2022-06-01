package Многопоточность.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread = new Thread(call::mobileCall);
        thread.start();
    }
}
class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall()  {
            lock.lock();
            System.out.println("call start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("call ends");
            lock.unlock();
        }
    }