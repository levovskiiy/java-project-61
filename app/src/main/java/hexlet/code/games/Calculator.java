package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator implements Game {
    private final int maxAttempts;
    private final List<Question> questions = new ArrayList<>();
    private final List<String> operations = List.of("+", "-", "*");
    private final Map<String, BiFunction<Integer, Integer, Integer>> executors = Map.of(
            "+", Integer::sum,
            "-", (a, b) -> a - b,
            "*", (a, b) -> a * b
    );

    public Calculator() {
        maxAttempts = 3;
    }

    @Override
    public void generateQuestions() {
        for (int i = 0; i < maxAttempts; i++) {
            var rand = Utils.generateRandomInt(2);
            var operation = operations.get(rand);
            var a = Utils.generateRandomInt(100);
            var b = Utils.generateRandomInt(100);

            var result = executors.get(operation).apply(a, b);
            var question = new Question(String.format("%s %s %s", a, operation, b), String.valueOf(result));
            questions.add(question);
        }
    }

    @Override
    public String getDescription() {
        return "What is the result of the expression?";
    }

    @Override
    public List<Question> getGameData() {
        return questions;
    }
}
