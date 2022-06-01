package Многопоточность;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);//создаёт 5 потоков
        // newSingleThreadExecutor
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Pool());
        }
        executorService.shutdown();//end
        executorService.awaitTermination(5, TimeUnit.MILLISECONDS);//ожидание
        System.out.println("ends");
    }
}
class Pool implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}