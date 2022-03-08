package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
//        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger("log.txt");
        return new ContextualLogger(fileLogger, name);
    }
}
