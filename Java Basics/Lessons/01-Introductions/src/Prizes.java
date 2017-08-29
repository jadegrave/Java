//NOTE: Uses Rsvps.java class

import java.io.Console;

public class Prizes {

    public static void main (String [] args) {
        Console console = System.console();
        String [] rsvps = Rsvps.shuffled();
        int prizesGivenAway = 0;
        int drawingNumber = 0;

        while (prizesGivenAway < 5) {
            String winner = rsvps[drawingNumber];
            drawingNumber++;
            console.printf("Is %s present?  ", winner);
            String isHere = console.readLine();
            if (isHere.equalsIgnoreCase("no")) {
                continue;
            }
            String size = console.readLine("What is your shirt size?  ");
            prizesGivenAway++;
        }


    }

}