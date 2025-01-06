package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression implements Game {
    private final int maxAttempts = 3;
    private final List<Question> questions = new ArrayList<>();

    @Override
    public void generateQuestions() {
        final int maxLengthProgression = 15;
        final int maxStepProgression = 8;

        for (int i = 0; i < maxAttempts; i++) {
            var start = Utils.generateRandomInt(1, maxLengthProgression);
            var step = Utils.generateRandomInt(2, maxStepProgression);
            var size = Utils.generateRandomInt(5, 10);
            var progression = generateProgression(start, step, size);
            var randomHiddenElement = progression[Utils.generateRandomInt(0, size - 1)];

            var question = new Question(
                    generateProgressionQuestion(progression, randomHiddenElement),
                    String.valueOf(randomHiddenElement));

            questions.add(question);
        }
    }

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }

    @Override
    public List<Question> getGameData() {
        return questions;
    }

    private String generateProgressionQuestion(int[] progression, int randomHiddenNumber) {
        var question = new StringBuilder();

        for (var num : progression) {
            if (num == randomHiddenNumber) {
                question.append("..");
                question.append(" ");
            } else {
                question.append(num);
                question.append(" ");
            }
        }

        return question.toString();
    }

    private int[] generateProgression(int start, int step, int size) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = start + (i - 1) * step;
        }

        return result;
    }
}
