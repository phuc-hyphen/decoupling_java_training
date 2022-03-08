package fr.lernejo.logger;

public class CompositeLogger implements Logger{

    public final Logger fileLogger, consoleLogger;
    public CompositeLogger(Logger file_logger, Logger console_logger) {
        this.fileLogger = file_logger;
        this.consoleLogger = console_logger;
    }

    @Override
    public void log(String message) {
        fileLogger.log(message);
        consoleLogger.log(message);
    }
}
