package Многопоточность;

import java.util.concurrent.CountDownLatch;

class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void market() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("market work");
        countDownLatch.countDown();
        System.out.println("count =" + countDownLatch.getCount());
    }
    private static void everythingReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("market is ready open");
        countDownLatch.countDown();
        System.out.println("count =" + countDownLatch.getCount());
    }
    private static void openMarket() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("market is  open");
        countDownLatch.countDown();
        System.out.println("count =" + countDownLatch.getCount());

    }
    public static void main(String[] args) throws InterruptedException {
       new Friends("Igor", countDownLatch);
       new Friends("denis", countDownLatch);
       new Friends("Maxim", countDownLatch);
       market();
       everythingReady();
       openMarket();
    }
}
class Friends extends Thread {
    String name;
    private final CountDownLatch countDownLatch;

    public Friends(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + "stating shop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
