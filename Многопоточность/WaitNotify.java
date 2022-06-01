package Многопоточность;

public class WaitNotify {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(consumer);
        thread.start();
        thread1.start();
    }
}
class Market {
    private int bread = 0;

    public synchronized void getBread() throws InterruptedException {
        while (bread < 1) {
            wait();
        }
        bread--;
        System.out.println("eat bread");
        System.out.println(bread);
        notify();
    }
    public synchronized void putBread() throws InterruptedException {
        while (bread >= 5) {
            wait();
        }
        bread++;
        System.out.println("put bread");
        System.out.println(bread);
        notify();
    }
}
class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                market.putBread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                market.getBread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}