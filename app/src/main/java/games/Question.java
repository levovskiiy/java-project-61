package games;

public class Question {
    private final String actual;
    private final String expected;

    public Question(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }

    public String getActual() {
        return actual;
    }

    public String getExpected() {
        return expected;
    }
}
