package hexlet.code;

public enum MenuChoice {
    GREETING(1, "Greeting"),
    EVEN(2, "Even"),
    CALC(3, "Calc"),
    GCD(4, "GCD"),
    PROGRESSION(5, "Progression"),
    PRIME(6, "Prime"),
    EXIT(0, "Exit");

    private final int code;
    private final String description;

    MenuChoice(final int menuCode, final String menuDescription) {
        code = menuCode;
        description = menuDescription;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static MenuChoice fromCode(final int code) {
        for (MenuChoice choice : values()) {
            if (choice.getCode() == code) {
                return choice;
            }
        }
        return null; // Если код не найден
    }
}
