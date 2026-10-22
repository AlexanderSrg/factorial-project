public class Factorial {
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Итеративный факториал 5: " + factorialIterative(5));
        System.out.println("Рекурсивный факториал 5: " + factorialRecursive(5));
    }
}