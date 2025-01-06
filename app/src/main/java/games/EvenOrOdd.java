package games;


import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class EvenOrOdd implements Game {
    private final int maxAttempts;
    private final List<Question> questions = new ArrayList<>();

    public EvenOrOdd() {
        this.maxAttempts = 3;
    }

    public void generateQuestions() {
        for (int i = 0; i < maxAttempts; i++) {
            var rand = Utils.generateRandomInt(100);
            var isEven = rand % 2 == 0;
            var correct = isEven ? "yes" : "no";
            questions.add(new Question(String.valueOf(rand), correct));
        }
    }


    @Override
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public List<Question> getGameData() {
        return questions;
    }
}
