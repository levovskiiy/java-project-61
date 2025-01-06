import hexlet.code.games.Game;
import hexlet.code.interaction.PlayerInteraction;


public class Engine {
    private final PlayerInteraction interaction;

    public Engine(PlayerInteraction interaction) {
        this.interaction = interaction;
    }

    public void run(Game game) {
        interaction.printMessage("Welcome to the Brain Games!");
        var playerName = interaction.getInput("May i have your name? ");
        interaction.printMessage("Hello " + playerName + "!");
        interaction.printMessage(game.getDescription());

        game.generateQuestions();
        var questions = game.getGameData();
        for (var question : questions) {
            interaction.printMessage("Question: " + question.getActual());
            var playerAnswer = interaction.getInput("Your answer: ");

            if (playerAnswer.equals(question.getExpected())) {
                System.out.println("Correct!");
            } else {
                printIncorrectMessage(question.getExpected(), playerAnswer, playerName);
                return;
            }
        }

        interaction.printMessage("Congratulations, " + playerName + "!");
        interaction.close();
    }

    private void printIncorrectMessage(String expected, String actual, String username) {
        var wrongMessage = String.format("'%s' is wrong answer ;(. Correct answer was '%s'", actual, expected);
        var tryGameMessage = String.format("Let's try again, %s!", username);

        interaction.printMessage(wrongMessage);
        interaction.printMessage(tryGameMessage);
    }
}
