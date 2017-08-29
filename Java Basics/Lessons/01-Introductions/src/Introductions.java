import java.io.Console;



public class Introductions {

    public static void main(String [] args){
        Console console = System.console();   //Creates java object (console object) which has a method to write out to the terminal (console)

        String firstName = console.readLine("What is your name?  ");

        console.printf("Hello, my name is %s\n", firstName);  // printf is how console object writes to the terminal
        console.printf("%s is learning to write Java\n", firstName);
    }


}