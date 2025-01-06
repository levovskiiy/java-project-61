package hexlet.code.games;

import hexlet.code.Utils;
import java.util.ArrayList;
import java.util.List;

public final class EvenOrOdd implements Game {
    @Override
    public List<Question> generateQuestions(final int maxAttempts) {
        final var max = 100;
        var questions = new ArrayList<Question>();
        for (int i = 0; i < maxAttempts; i++) {
            var rand = Utils.generateRandomInt(max);
            var isEven = rand % 2 == 0;
            var correct = isEven ? "yes" : "no";
            questions.add(new Question(String.valueOf(rand), correct));
        }

        return questions;
    }


    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
