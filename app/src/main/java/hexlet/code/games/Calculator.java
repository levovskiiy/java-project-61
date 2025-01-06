package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public final class Calculator implements Game {
    /**
     * Доступные операции.
     */
    private final List<String> operations = List.of("+", "-", "*");
    /**
     * Отображение операций на обработчик этих операций.
     */
    private final Map<String, BiFunction<Integer, Integer, Integer>> executors = Map.of(
            "+", Integer::sum,
            "-", (a, b) -> a - b,
            "*", (a, b) -> a * b
    );

    @Override
    public List<Question> generateQuestions(final int maxAttempts) {
        var questions = new ArrayList<Question>();
        final int maxValue = 100;

        for (int i = 0; i < maxAttempts; i++) {
            var rand = Utils.generateRandomInt(2);
            var operation = operations.get(rand);
            var a = Utils.generateRandomInt(maxValue);
            var b = Utils.generateRandomInt(maxValue);

            var result = executors.get(operation).apply(a, b);
            var question = new Question(String.format("%s %s %s", a, operation, b), String.valueOf(result));
            questions.add(question);
        }

        return questions;
    }

    @Override
    public String getDescription() {
        return "What is the result of the expression?";
    }
}
