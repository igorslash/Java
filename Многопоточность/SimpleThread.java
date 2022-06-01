package Многопоточность;

import java.util.ArrayList;

//public class SimpleThread extends Thread {
public class SimpleThread implements Runnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(new SimpleThread());
        t.start();
        ArrayList ar = new ArrayList();
        for (int i = 0; i < 100; i++) {
            ar.add(new Object());
        }
        System.out.println("H");
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
        }
    }
}
