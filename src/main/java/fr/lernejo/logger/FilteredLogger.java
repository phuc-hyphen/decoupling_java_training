package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger {
    public final Logger delegate;
    public static Predicate<String> Condition;

    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        //TODO assign arguments to fields
        this.delegate = delegate;
        Condition = condition;
    }

    @Override
    public void log(String message) {
        if (Condition.test(message))
            delegate.log(message);
    }


}
