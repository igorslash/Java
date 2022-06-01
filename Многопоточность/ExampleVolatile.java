package Многопоточность;

public class ExampleVolatile {
    public static void main(String[] args) throws InterruptedException {
        Volatile v = new Volatile();
        v.start();
        Thread.sleep(3000);
        System.out.println("wake up");
        v.x = false;
        v.join();
        System.out.println("end");
    }
}
class Volatile extends Thread {
    volatile boolean x = true;//volatile используется только тогда, когда
    // один поток может изменять значение переменной, а остальные потоки только читать
    @Override
    public void run() {
        long count = 0;
        while (x) {
            count++;
        }
        System.out.println(count);
    }
}