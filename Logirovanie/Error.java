package Logirovanie;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Error {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Error.class.getName());
        Supplier<String> stringSupplier = () -> "Logirovanie";
        logger.log(Level.SEVERE,
                new RuntimeException("Error"), stringSupplier);

        LogRecord record = new LogRecord(Level.INFO, "Message");
        logger.log(record);
    }
}
