package Многопоточность;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollections {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = () -> {synchList.addAll(source);};
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        thread1.start();
        thread.start();
        thread.join();
        thread1.join();
        System.out.println(synchList);


        ////////////////////////////////////////////////////////////////////////
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < 10;i++) {
            arrayList.add(i);
        }
        Runnable runnable1 =() -> {
            synchronized (synchList) {
            Iterator<Integer> iterator = synchList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    };
        Runnable runnable2 = () -> {
            synchList.remove(10);
        };
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread.start();
        thread.join();
        thread1.join();
        System.out.println(arrayList);

        ///////////////////////////////////////////////////////////////////
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(9);
        List<Integer> list = Collections.synchronizedList(arrayList);
        Thread thread4 = new Thread(() -> list.addAll(arrayList));
        Thread thread5 = new Thread(() -> list.remove(2));
        thread1.start();
        thread.start();
        thread1.join();
        thread.join();
        System.out.println(list);
    }

}
