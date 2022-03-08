package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.text.SimpleDateFormat;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        long GuessNumber = player.askNextGuess();
//        logger.log(Long.toString(GuessNumber));
        if (GuessNumber == numberToGuess) {
//            logger.log("Win");
            return true;
        }
        if (GuessNumber > numberToGuess) {
            logger.log("Greater");
            player.respond(false);
            return false;
        }
        logger.log("Lower");
        player.respond(true);
        return false;
    }

    public void loopUntilPlayerSucceed(long MaxIterations) {
        //TODO implement me
        long Start_TimeStamp = System.currentTimeMillis();
        while (MaxIterations > 0) {
            if (nextRound())
                break;
            MaxIterations -= 1;
        }
        long End_TimeStamp = System.currentTimeMillis();
        String TotalTime = new SimpleDateFormat("mm:ss.SSS").format(End_TimeStamp - Start_TimeStamp);
        logger.log(TotalTime);
        if (MaxIterations > 0)
            logger.log("Won");
        else
            logger.log("Lose");


    }
}
