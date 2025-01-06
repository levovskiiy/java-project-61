package hexlet.code.interaction;

public interface PlayerInteraction {
    String getInput(String prompt);
    String getInput();
    void printMessage(String message);
    void close();
}
