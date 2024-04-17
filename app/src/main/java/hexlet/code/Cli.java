package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner input = new Scanner(System.in);
    public static void printGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = input.next();

        System.out.println("Hello, " + name);
        input.close();
    }
}
