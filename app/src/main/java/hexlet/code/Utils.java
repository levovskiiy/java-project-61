package hexlet.code;

public final class Utils {
    private Utils() {
    }

    public static int generateRandomInt(final int maxValue) {
        return (int) (Math.random() * maxValue);
    }

    public static int generateRandomInt(final int minValue, final int maxValue) {
        return minValue + (int) (Math.random() * maxValue);
    }

    public static int gcd(final int a, final int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    public static boolean isPrime(final int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
