package Многопоточность.SimpleDeadlock;

public class Deadlock {
    public static void main(String[] args) {
        SimpleThread1 st1 = new SimpleThread1();
        SimpleThread2  st2 = new  SimpleThread2();
        st1.start();
        st2.start();
    }
    private static class SimpleThread1 extends Thread {
        @Override
        public void run() {
            synchronized (SimpleThread1.class) {
                System.out.println("Thread1: Hold SimpleThread1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1 waiting SimpkeThread2");
                synchronized (SimpleThread2.class) {
                    System.out.println("Thread1: Hold SimpleThread2");

                }
            }
        }
    }
    private static class SimpleThread2 extends Thread {
        @Override
        public void run() {
            synchronized (SimpleThread2.class) {
                System.out.println("Thread2: Hold SimpleThread1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 waiting SimpleThread1");
                synchronized (SimpleThread1.class) {
                    System.out.println("Thread2: Hold SimpleThread1");
                }
            }
        }
    }
}
