import java.util.Scanner;

public class loopidyscoopwoop {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("type a word big boi");

        String userInput = "";

        userInput = keyboard.next();

        while (!userInput.equalsIgnoreCase("q")) {
            System.out.println("type a word big boi or type q to quit" + userInput);
            userInput = keyboard.next();
        }

    }

}
