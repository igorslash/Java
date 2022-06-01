package Многопоточность.Interrupt;

public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        c.start();
        Thread.sleep(2000);
        c.interrupt();
    }
}
class Counter extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted()) {
            System.out.println("i = " + i++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                break;
                //e.printStackTrace();
            }
        }
    }
}