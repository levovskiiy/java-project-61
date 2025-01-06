package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Gcd implements Game {
    @Override
    public List<Question> generateQuestions(final int maxAttempts) {
        var questions = new ArrayList<Question>();
        final int maxValue = 100;

        for (int i = 0; i < maxAttempts; i++) {
            var first = Utils.generateRandomInt(maxValue);
            var second = Utils.generateRandomInt(maxValue);

            var question = new Question(
                    first + " " + second,
                    String.valueOf(Utils.gcd(first, second))
            );
            questions.add(question);
        }

        return questions;
    }

    @Override
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
}
