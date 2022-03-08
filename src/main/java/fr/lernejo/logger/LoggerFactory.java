package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger("log.txt");
        CompositeLogger compositeLogger = new CompositeLogger(fileLogger,consoleLogger);
        return new ContextualLogger(compositeLogger, name);
    }
}
