package Logirovanie;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class MonitorLogger {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        LogManager logManager = LogManager.getLogManager();
        logManager.addLogger(Logger.getLogger(MonitorLogger.class.getName()));
        logManager.getLogger(MonitorLogger.class.getName());

        ExecutorService executorServiceLog = Executors.newFixedThreadPool(2);
        javax.management.monitor.Monitor monitor = new javax.management.monitor.Monitor() {

            @Override
            public void start() {
                Future<?> future = executorServiceLog.submit(() -> {
                    for (int i = 0; i < 50; i++) {
                        //System.out.println(Thread.currentThread().getName() + i);
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
                Future<?> f = executorServiceLog.submit(() -> {
                    for (int x = 50; x < 100; x++) {
                        //System.out.println(Thread.currentThread().getName() + x);
                        System.out.println(x);
                    }
                });
                try {
                    f.get();
                    f.isDone();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        monitor.start();
        executorServiceLog.shutdown();
        LOGGER.log(Level.INFO, "Info");
        LOGGER.log(Level.FINE, "info mos important");
    }
}

