package Многопоточность.Synhronization;

public class Main {
    public static void main(String[] args) {
        Tickets[] t = {
                new Tickets(10),
                new Tickets(20),
                new Tickets(30),
                new Tickets(40)};

        Cashier c1 = new Cashier(1, t);
        Cashier c2 = new Cashier(2, t);
        Cashier c3 = new Cashier(3, t);
        Cashier c4 = new Cashier(4, t);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
