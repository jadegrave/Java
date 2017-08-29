import java.io.Console;
import java.util.Random;

public class DunkTankFor {

    public static void main (String [] args) {
        Console console = System.console();
        Random skill = new Random();

        boolean isDunked = false;

        for (int ballsThrown = 0; !isDunked && ballsThrown <= 3; ballsThrown++) {
            console.printf("Try #%d ...%n", ballsThrown - 1);
            isDunked = skill.nextBoolean();
        }

        if (isDunked) {
            console.printf("Air Punch!!!!%n");
        } else {
            console.printf("Boo!!!!%n");
        }


    }

}