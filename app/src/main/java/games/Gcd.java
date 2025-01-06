package games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Gcd implements Game {
    private final int maxAttempts = 3;
    private final List<Question> questions = new ArrayList<Question>();

    @Override
    public void generateQuestions() {
        for (int i = 0; i < maxAttempts; i++) {
            var first = Utils.generateRandomInt(100);
            var second = Utils.generateRandomInt(100);

            var question = new Question(first + " " + second, String.valueOf(Utils.gcd(first, second)));
            questions.add(question);
        }
    }

    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public List<Question> getGameData() {
        return questions;
    }
}
