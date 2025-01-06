package hexlet.code.interaction;

import java.util.Scanner;

public class ConsoleInteraction implements PlayerInteraction {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getInput(String prompt) {
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
    public void printMessage(String message) {
        System.out.println(message);
    }

    public int getInteger() {
        return scanner.nextInt();
    }

    public void close() {
        scanner.close();
    }
}
