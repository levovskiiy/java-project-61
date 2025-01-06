package hexlet.code.interaction;

public interface PlayerInteraction {
    /**
     * Считать ответ от игрока.
     * @param prompt сообщение
     * @return считанное значение
     */
    String getInput(String prompt);

    /**
     * Считать ответ от игрока.
     * @return считанное значение
     */
    String getInput();

    /**
     * Напечатать в буфер вывода сообщение.
     * @param message сообщение которое нужно печатать
     */
    void printMessage(String message);

    /**
     * Закрыть интерфейс взаимодействия.
     */
    void close();
}
