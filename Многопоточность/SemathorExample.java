package Многопоточность;

import java.util.concurrent.Semaphore;

public class SemathorExample {
    public static void main(String[] args) {
        Semaphore call = new Semaphore(2);

        new Person(" igor ", call);
        new Person(" Denis ", call);
        new Person(" Maxim ", call);
        new Person(" Ira ", call);

    }
}
class Person extends Thread{
    String name;
    private final Semaphore call;

    public Person(String name, Semaphore call) {
        this.name = name;
        this.call = call;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + "wait");
            call.acquire();
            System.out.println(name + "call by telephone");
            sleep(2000);
            System.out.println(name + "call end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            call.release();
        }
    }
}