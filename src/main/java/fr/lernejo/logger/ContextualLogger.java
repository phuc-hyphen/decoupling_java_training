package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger {
    private final Logger logger;
    private static String CallerClass;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void log(String message) {
        logger.log(LocalDateTime.now().format(formatter) + " " + CallerClass + " " + message);
    }

    public ContextualLogger(String callerClass, Logger delegateLogger) {
        this.logger = delegateLogger;
        CallerClass = callerClass;
    }
}
