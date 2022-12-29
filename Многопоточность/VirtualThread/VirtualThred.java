package Многопоточность.VirtualThread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Virtual {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new RandomNumbers());
        }
        executorService.shutdown();
        if (!executorService.awaitTermination(60, TimeUnit.SECONDS));
        executorService.shutdownNow();
    }
}
class RandomNumbers implements Runnable {
    Random random = new Random();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt();
            int y = random.nextInt();
            int c = x ^ y;
            System.out.println(c);
        }
    }
}



