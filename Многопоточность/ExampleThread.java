package Многопоточность;

public class ExampleThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start");
            }
        }).start();
        new Thread(() -> System.out.println("s")).start();
    }
}
