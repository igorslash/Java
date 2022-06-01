package Многопоточность.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EmployeeLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee emp1 = new Employee("igor", lock),
        emp2 = new Employee("comp", lock),
        emp3 = new Employee("red", lock);
        Thread thread = new Thread(emp1);
        Thread thread1 = new Thread(emp2);
        Thread thread2 = new Thread(emp3);
        thread.start();
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        Thread.sleep(2000);
        thread2.start();

    }
}
class Employee extends Thread implements Runnable {
    String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        if (lock.tryLock()) {
//        System.out.println(name + " wait ");
//        lock.lock();
            System.out.println(name + " enjoy atm ");
            try {
                Thread.sleep(2000);
                System.out.println(name + " finish affairs ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + "I'm a hurry");
        }

    }
}
