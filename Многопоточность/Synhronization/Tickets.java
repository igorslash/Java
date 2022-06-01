package Многопоточность.Synhronization;

public class Tickets extends Cashier {
    boolean isBooth;
    int place;

    public Tickets(int place) {
        this.place = place;
    }
    synchronized void buy(Cashier c) throws InterruptedException {
        if (!isBooth) {
            Thread.sleep(2000);
            isBooth = true;
            System.out.printf("Cashier = %s, id = %d ",  c.getId(),this.place);
        }
    }
}