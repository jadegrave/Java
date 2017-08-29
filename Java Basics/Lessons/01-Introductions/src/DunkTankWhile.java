import java.io.Console;
import java.util.Random;

public class DunkTankWhile {

    public static void main (String [] args) {
        Console console = System.console();
        Random skill = new Random();

        boolean isDunked = false;
        int ballsThrown = 0;

        while(! isDunked && ballsThrown <= 3) {
            console.printf("Try #%d ...%n", ballsThrown + 1);
            isDunked = skill.nextBoolean();
            ballsThrown++;
        }

        if (isDunked) {
            console.printf("Air punch!!!!%n");
        } else {
            console.printf("Boo!!!!%n");
        }

    }
}