package hexlet.code;

import hexlet.code.games.EvenOrOdd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Cli.printGameMenu();

        var choice = Cli.userChoice();
        switch (choice) {
            case 1:
                Cli.printGreeting();
                break;
            case 2:
                var name = Cli.printGreeting();
                var evenGame = new EvenOrOdd(name);
                evenGame.loop();
        }
    }
}
