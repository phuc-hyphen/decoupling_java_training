package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        HumanPlayer Human = new HumanPlayer();
        Simulation simu = new Simulation(Human);

        SecureRandom random = new SecureRandom();
// long randomNumber = random.nextLong(); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        long random_Number = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
        simu.initialize(random_Number);
        simu.loopUntilPlayerSucceed();
    }
}
