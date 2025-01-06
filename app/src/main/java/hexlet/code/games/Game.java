package hexlet.code.games;

import java.util.List;

public interface Game {
    /**
     * Генерация списка ответов для игрока.
     * @param attempts количество попыток
     * @return Список ответов
     */
    List<Question> generateQuestions(int attempts);

    /**
     * @return описание гры
     */
    String getDescription();
}
