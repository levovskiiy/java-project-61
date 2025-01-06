package hexlet.code;

import hexlet.code.games.GameFactory;
import hexlet.code.interaction.ConsoleInteraction;
import hexlet.code.interaction.PlayerInteraction;

public class App {
    private static final PlayerInteraction INTERACTION = new ConsoleInteraction();

    public static void main(String[] args) {
        start();
    }

    private static void printGameMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (var choice : MenuChoice.values()) {
            System.out.printf("%d - %s%n", choice.getCode(), choice.getDescription());
        }
    }

    private static void start() {
        printGameMenu();

        var choiceCode = INTERACTION.getInput();
        var gameChoice = MenuChoice.fromCode(Integer.parseInt(choiceCode));

        if (gameChoice == MenuChoice.EXIT) {
            return;
        }

        if (gameChoice == MenuChoice.GREETING) {
            Cli.greeting();
            return;
        }

        var game = GameFactory.createGame(gameChoice);
        var engine = new Engine(INTERACTION);
        engine.run(game);

        INTERACTION.close();
    }
}
