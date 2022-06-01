package Многопоточность;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
   public static void main(String[] args) {
      ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
      queue.add(1);
      queue.add(2);
      queue.add(5);
      queue.add(10);
      queue.offer(6);//исключения не будет в отличии от add но не добавится

      //////////////////////////////////////////////////
      new Thread(() -> {
         int i = 0;
         while (true) {
            try {
               queue.put(++i);
               System.out.println("add" + i);
               Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }).start();
      new Thread(() -> {
         int i = 0;
         while (true) {
            try {
               Integer j = queue.take();
               System.out.println("take" + j);
               Thread.sleep(2000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }).start();
   }
}
