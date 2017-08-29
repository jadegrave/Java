import java.io.Console;

public class Questions {

    public static void main (String [] args) {
        Console console = System.console();

        String anyQuestions = console.readLine("Are there any questions?  ");

        while(anyQuestions.equals("yes")) {
            String question = console.readLine("What is your question?  ");
            console.printf("I do not undertand:   %s", question);
            anyQuestions = console.readLine("%nAre there any more questions?  ");
        }

        console.printf("Next slide...%n");
    }

}