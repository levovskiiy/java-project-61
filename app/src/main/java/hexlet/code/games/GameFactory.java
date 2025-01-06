package hexlet.code.games;

import hexlet.code.MenuChoice;

public final class GameFactory {
    private GameFactory() {
    }

    /**
     * Фабрика создания игры в зависимости от выбра пользователя.
     * @param choice выбор игрока на основе которого создается инстанс игры
     * @return инстанс игры
     */
    public static Game createGame(final MenuChoice choice) {
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
