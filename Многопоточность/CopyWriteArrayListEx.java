package Многопоточность;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Thread thread = new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(list.iterator().next());
        });
        thread.start();
        thread.join();
        Thread thread1 = new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(5);
            list.remove(2);
            System.out.println(list.iterator().next());
        });
        thread1.start();
        thread1.join();
        System.out.println(list);
    }
}
