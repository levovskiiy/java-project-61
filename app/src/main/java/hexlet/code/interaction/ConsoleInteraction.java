package hexlet.code.interaction;

import java.util.Scanner;

public final class ConsoleInteraction implements PlayerInteraction {
    /**
     * Консольный ввод/вывод.
     */
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(final String prompt) {
        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }

        return scanner.nextLine();
    }

    @Override
    public String getInput() {
        return getInput("");
    }

    @Override
    public void printMessage(final String message) {
        System.out.println(message);
    }

    @Override
    public void close() {
        scanner.close();
    }
}
