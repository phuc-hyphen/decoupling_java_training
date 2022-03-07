package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long random_Number = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
        if (args.length == 0) {
            System.out.println("""
                Utilisation Guild :
                 * add -interactive to play as Human Player.
                 * add -auto with a number to guess and the Robot will try to find it. 
                """);
        }
        else if (args[0].equals("-interactive")) {
            HumanPlayer Human = new HumanPlayer();
            Simulation simu = new Simulation(Human);
            simu.initialize(random_Number);
            simu.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        else if (args[0].equals("-auto") && !args[1].isEmpty()) {
            long NumberToGuess = Integer.parseInt(args[1]);
            ComputerPlayer Robot = new ComputerPlayer();
            Simulation simu = new Simulation(Robot);
            simu.initialize(NumberToGuess);
            simu.loopUntilPlayerSucceed(1000);
        }
    }
}
