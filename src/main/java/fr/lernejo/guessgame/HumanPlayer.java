package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    @Override
    public long askNextGuess() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        String Number = scn.nextLine();  // Read user input
        return Integer.parseInt(Number);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        Logger logger = LoggerFactory.getLogger("player");
    }


}
