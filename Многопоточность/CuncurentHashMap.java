package Многопоточность;

import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "2");
        hashMap.put(2, "3");
        hashMap.put(3, "4");
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Integer i = hashMap.keySet().iterator().next();
            System.out.println(i + ":" + hashMap.get(i));
        });
        thread.join();
        thread.start();
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hashMap.put(4, "5");
            Integer i = hashMap.keySet().iterator().next();
            System.out.println(i + ":" + hashMap.get(i));
        });
        thread1.start();
        thread1.join();
        System.out.println(hashMap);

    }
}
