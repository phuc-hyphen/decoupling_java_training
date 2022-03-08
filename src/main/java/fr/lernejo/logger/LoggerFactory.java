package fr.lernejo.logger;

import java.util.function.Predicate;

public class LoggerFactory {
    public static Logger getLogger(String name) {
//        Predicate<String> condition = message -> message.contains("simulation");
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger("log.txt");
        FilteredLogger filteredLogger = new FilteredLogger(fileLogger, message -> message.contains("simulation"));
        CompositeLogger compositeLogger = new CompositeLogger(filteredLogger, consoleLogger);
        return new ContextualLogger(name, compositeLogger);
    }
}
