package Многопоточность;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Monitor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        javax.management.monitor.Monitor monitor = new javax.management.monitor.Monitor() {
            @Override
            public void start() {
                Future<?> future = executorService.submit(() -> {
                    for (int i = 0; i < 50; i++) {
                        System.out.println(i);
                    }
                });
                try {
                    future.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
            @Override
            public void stop() {
                Future<?> f = executorService.submit(() -> {
                    for (int x = 50; x < 100; x++) {
                        System.out.println(x);
                    }
                });
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        monitor.start();
        executorService.shutdown();
    }
}

