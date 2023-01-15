package Logirovanie;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Loging {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Loging.class.getName());
        logger.log(Level.INFO,"LOg");
        logger.log(Level.SEVERE, "loging", new RuntimeException("system error"));
        logger.log(Level.WARNING, "log warning", new Exception("exeption"));
    }
}
