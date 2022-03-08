package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger {
    public final Logger delegate;
    public final Predicate<String> Condition;

    @Override
    public void log(String message) {
        if (Condition.test(message))
            delegate.log(message);
    }

    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        this.delegate = delegate;
        //TODO assign arguments to fields
        this.Condition = condition;
    }
}
