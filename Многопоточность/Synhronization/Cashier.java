package Многопоточность.Synhronization;

public class Cashier extends Thread {
    private int id;
    Tickets[] t;

    public Cashier() {}

    public Cashier(int id, Tickets[] t) {
        this.id = id;
        this.t = t;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public synchronized void run() {
        for (int i = 0; i < t.length; i++) {
            try {
                t[i].buy(this);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

