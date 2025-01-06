public class Utils {
    public static int generateRandomInt(int maxValue) {
        return (int) (Math.random() * maxValue);
    }

    public static int generateRandomInt(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * maxValue);
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
