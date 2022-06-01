package Многопоточность.Interrupt;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();
        Thread thread = new Thread(example::start);
        example.interrupt();//прерывание потока
        Thread.sleep(2000);
        thread.start();
        thread.join();
        System.out.println("ends");
    }
}
class Example extends Thread{
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 10; i++ ) {
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}