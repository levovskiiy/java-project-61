package hexlet.code.games;

import hexlet.code.MenuChoice;

public class GameFactory {
    public static Game createGame(MenuChoice choice) {
        return switch (choice) {
            case EVEN -> new EvenOrOdd();
            case CALC -> new Calculator();
            case GCD -> new Gcd();
            case PROGRESSION -> new Progression();
            case PRIME -> new Prime();
            default -> throw new IllegalArgumentException("Invalid choice");
        };
    }
}
