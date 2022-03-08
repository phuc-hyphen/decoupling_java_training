package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger {
    private final Logger logger;
    private final String callerClass;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void log(String message) {
        logger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }

    public ContextualLogger(Logger delegateLogger, String callerClass) {
        this.logger = delegateLogger;
        this.callerClass = callerClass;
    }
}
