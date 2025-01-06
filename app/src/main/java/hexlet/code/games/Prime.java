package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Prime implements Game {
    private final int maxAttempts = 3;
    private final List<Question> questions = new ArrayList<>();


    @Override
    public void generateQuestions() {
        for (int i = 0; i < maxAttempts; i++) {
            var num = Utils.generateRandomInt(0, 100);
            var question = new Question(String.valueOf(num), Utils.isPrime(num) ? "yes" : "no");
            questions.add(question);
        }
    }

    @Override
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public List<Question> getGameData() {
        return questions;
    }
}
