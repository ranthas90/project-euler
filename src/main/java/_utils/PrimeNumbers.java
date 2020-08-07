package _utils;

public class PrimeNumbers {

    public static boolean isPrime(double number) {

        if (number <= 1) {
            return false;
        }

        for (double i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
