package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess; //TODO add variable type

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
        if(GuessNumber == numberToGuess ){
            player.respond(true);
            return true;
        }
        if(GuessNumber > numberToGuess )
        {
            player.respond(false);
            System.out.println("Higher");
            return false;
        }
        player.respond(false);
        System.out.println("Lower");
        return false;
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        while (true)
        {
            if(nextRound())
                break;
        }
    }
}
