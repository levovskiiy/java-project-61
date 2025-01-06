package hexlet.code.games;

import java.util.List;

public interface Game {
    void generateQuestions();
    String getDescription();
    List<Question> getGameData();
}
