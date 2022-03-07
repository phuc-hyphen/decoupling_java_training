package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class ComputerPlayer implements Player {
    public static long max = Long.MAX_VALUE;
    public static long min = 0;
    public static long avg;

    @Override
    public long askNextGuess() {
        return Dichotomie();
    }

    @Override
    public void respond(boolean lowerOrGreater) { // false : guess > to find , true : guess < to find
        Logger logger = LoggerFactory.getLogger("Robot");
//        logger.log(Long.toString(avg));
        if (lowerOrGreater)
            min = avg;
        else
            max = avg;
    }

    public long Dichotomie() {
        avg = (long) (min + Math.ceil((double) (max - min) / 2));
        return avg;
    }
}
