package Logirovanie;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//Loggers – отвечает за сбор записей журнала и передачу их соответствующему заявителю.
//Appenders или Handlers – они отвечают за запись событий журнала в пункт назначения.
// Аппендеры форматируют события с помощью макетов перед отправкой результатов.
//Layouts или Formatters – отвечает за определение того, как данные выглядят,
// когда они появляются в записи журнала.

//FATAL;
//ERROR;
//WARN;
//INFO;
//DEBUG.

//logging предоставляет следующие уровни в порядке убывания:

//SEVERE(HIGHEST LEVEL);
//WARNING;
//INFO;
//CONFIG;
//FINE;
//FINER;
//FINEST(LOWEST LEVEL).

public class Log {
    public static void main(String[] args) {
        EditLogger em = new EditLogger();
        em.sampleLog();
        LogManager logger = LogManager.getLogManager();
        Logger log = logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.log(Level.WARNING, "Error");
    }
}
class EditLogger {

    private final Logger logger = Logger.getLogger(EditLogger.LOGGER.getName());
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void sampleLog() {
        LOGGER.log(Level.WARNING, "error");
    }
}
