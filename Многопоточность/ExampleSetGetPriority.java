package Многопоточность;

public class ExampleSetGetPriority {
    public static void main(String[] args) {
        ExampleGetPriority egp = new ExampleGetPriority();
        egp.setName("my potok");
        egp.setPriority(Thread.MAX_PRIORITY);//приоритет max, min, norm
        egp.start();
        System.out.println(egp.getName() + egp.getPriority());//getName()-0 приоритет 5

    }
}
class ExampleGetPriority extends Thread {
    @Override
    public void run() {
        System.out.println("run" + Thread.currentThread().getName());//информация о
        // текущем потоке currentThread

    }
}