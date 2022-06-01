package Многопоточность.Daemon;

public class Main {
    public static void main(String[] args) {
        Daemon d = new Daemon();
        Daemon d2 = new Daemon();
        d.setDaemon(true);
        d.start();
        d2.start();
    }
}
class Daemon extends Thread {
    @Override
    public void run() {
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
        }finally {
            if (!isDaemon()) {
                System.out.println("finish daemon");
            }else {
                System.out.println("finish  обычного потокa");
            }
        }
    }
}