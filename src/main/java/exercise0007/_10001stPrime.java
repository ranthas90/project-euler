package exercise0007;

import static _utils.PrimeNumbers.isPrime;
import static _utils.Timer.*;

public class _10001stPrime {

    private static final double PRIME_10001 = 10001;

    public static void main(String[] args) {

        double primeCounter = 1D;
        double lastNumberChecked = 0D;

        startTimer();

        while (primeCounter <= PRIME_10001) {
            if (isPrime(lastNumberChecked)) {
                primeCounter++;
            }
            lastNumberChecked++;
        }

        stopTimer();
        System.out.println("Result: " + (lastNumberChecked - 1D) + " obtained in " + getTimeEllapsed() + " seconds.");
    }
}
