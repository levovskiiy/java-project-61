package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Prime implements Game {
    @Override
    public List<Question> generateQuestions(final int maxAttempts) {
        var questions = new ArrayList<Question>();
        final var endMaxNumber = 100;

        for (int i = 0; i < maxAttempts; i++) {
            var num = Utils.generateRandomInt(0, endMaxNumber);
            var question = new Question(String.valueOf(num), Utils.isPrime(num) ? "yes" : "no");
            questions.add(question);
        }

        return questions;
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
