package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner input = new Scanner(System.in);
    private static final String[] games = {
            "Greeting",
            "Even",
    };

    public static String printGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = input.next();

        System.out.println("Hello, " + name);
        return name;
    }

    public static void printGameMenu() {
        System.out.println("Please enter the game number and press Enter");

        for (var i = 0; i < games.length; i++) {
            System.out.println(i + 1 + " - " + games[i]);
        }


        System.out.println("0 - Exit");
    }

    public static int userChoice() {
        System.out.print("Your choice: ");
        return input.nextInt();
    }
}
