package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.interaction.PlayerInteraction;


public final class Engine {
    /**
     * АПИ взаимодействия пользователя с движком.
     */
    private final PlayerInteraction interaction;
    /**
     * Макисмальное количество попыток.
     */
    private static final int MAX_ATTEMPTS = 3;

    Engine(final PlayerInteraction playerInteraction) {
        interaction = playerInteraction;
    }

    /**
     * Запускает игровой движок. Получает игру из которой генерирует данные для игрока.
     * @param game игра
     */
    public void run(final Game game) {
        interaction.printMessage("Welcome to the Brain Games!");
        var playerName = interaction.getInput("May i have your name? ");
        interaction.printMessage("Hello, " + playerName + "!");
        interaction.printMessage(game.getDescription());

        var questions = game.generateQuestions(MAX_ATTEMPTS);
        for (var question : questions) {
            interaction.printMessage("Question: " + question.actual());
            var playerAnswer = interaction.getInput("Your answer: ");

            if (playerAnswer.equals(question.expected())) {
                System.out.println("Correct!");
            } else {
                printIncorrectMessage(question.expected(), playerAnswer, playerName);
                return;
            }
        }

        interaction.printMessage("Congratulations, " + playerName + "!");
        interaction.close();
    }

    /**
     * Печатает сообщение в случае неудачной попытки.
     * @param expected ожидаемый результат
     * @param actual значение которое получено
     * @param username имя игрока
     */
    private void printIncorrectMessage(final String expected, final String actual, final String username) {
        var wrongMessage = String.format("'%s' is wrong answer ;(. Correct answer was '%s'", actual, expected);
        var tryGameMessage = String.format("Let's try again, %s!", username);

        interaction.printMessage(wrongMessage);
        interaction.printMessage(tryGameMessage);
    }
}
