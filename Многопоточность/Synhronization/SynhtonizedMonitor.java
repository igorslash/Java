package Многопоточность.Synhronization;

public class SynhtonizedMonitor {
    static final Object lock = new Object();
    public void abc() {
        synchronized (lock) {

        }
    }
}
