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

    MenuChoice(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static MenuChoice fromCode(int code) {
        for (MenuChoice choice : values()) {
            if (choice.getCode() == code) {
                return choice;
            }
        }
        return null; // Если код не найден
    }
}
