package hexlet.code.games;

import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Progression implements Game {
    @Override
    public List<Question> generateQuestions(final int maxAttempts) {
        var questions = new ArrayList<Question>();

        final var maxLengthProgression = 15;
        final var maxStepProgression = 8;
        final var maxSize = 10;
        final var minSize = 5;

        for (int i = 0; i < maxAttempts; i++) {
            var start = Utils.generateRandomInt(1, maxLengthProgression);
            var step = Utils.generateRandomInt(2, maxStepProgression);
            var size = Utils.generateRandomInt(minSize, maxSize);
            var progression = generateProgression(start, step, size);
            var randomHiddenElement = progression[Utils.generateRandomInt(0, size - 1)];

            var question = new Question(
                    generateProgressionQuestion(progression, randomHiddenElement),
                    String.valueOf(randomHiddenElement));

            questions.add(question);
        }

        return questions;
    }

    @Override
    public String getDescription() {
        return "What number is missing in the progression?";
    }

    private String generateProgressionQuestion(final int[] progression, final int randomHiddenNumber) {
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

    private int[] generateProgression(final int start, final int step, final int size) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = start + (i - 1) * step;
        }

        return result;
    }
}
