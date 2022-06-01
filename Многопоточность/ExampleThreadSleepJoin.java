package Многопоточность;

class ExampleThreadJoinSleep {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Sleep());
        Sleep1 sleep = new Sleep1();
        thread.start();
        sleep.start();
        thread.join();
        sleep.join();
        System.out.println("end" + sleep.getState());//getState() Возвращает состояние этого потока. Этот метод
        // предназначен для использования при мониторинге состояния системы, а не для управления синхронизацией.
    }
}
class Sleep implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "" + i);//currentThread инфо о потоке
                }
            }
}
class Sleep1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "" + i);
        }
    }
}
//for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("start");

