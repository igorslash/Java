package Многопоточность;

import java.util.concurrent.*;

public class CallableExample {//Callable изпользуется только с  ExecutorService
    //чтобы задача возвращала результат используется Callable
    static int result;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFactorial cf = new CallableFactorial(5);
        Future future1 = executorService.submit(cf);
        System.out.println(future1.get());//null
        Future<Integer> future = executorService.submit(cf);
        future.isDone();//проверяет закончена задача или нет
        System.out.println(future.get());
        executorService.shutdown();
    }
}
class CallableFactorial implements Callable<Integer> {
    int f;

    public CallableFactorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new IllegalArgumentException("wrong number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}