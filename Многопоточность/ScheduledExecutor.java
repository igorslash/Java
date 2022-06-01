package Многопоточность;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {//используется тогда когда хотим установить расписание на запуск потоков
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
            scheduledExecutorService.schedule(new Schedule(), 4, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(new Schedule(), 3, 1, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new Schedule(), 5, 2, TimeUnit.SECONDS);
            scheduledExecutorService.shutdown();

            ExecutorService executorService = Executors.newCachedThreadPool();
        }
    }
class Schedule implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}