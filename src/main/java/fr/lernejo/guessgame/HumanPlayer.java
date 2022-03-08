package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    public static String Number;

    @Override
    public long askNextGuess() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Guess a number :");
        Number = scn.nextLine();  // Read user input
        return Integer.parseInt(Number);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        Logger logger = LoggerFactory.getLogger("player");
        logger.log(Number);
    }


}
