package exercise0002;

import _utils.Timer;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        long sum = 2;
        long firstTerm = 1;
        long secondTerm = 2;
        long nextTerm = 0;

        Timer.startTimer();

        while (nextTerm <= 4000000) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            if (isEven(nextTerm)) {
                sum = sum + nextTerm;
            }
        }

        Timer.stopTimer();
        System.out.println("Result: " + sum + " obtained in " + Timer.getTimeEllapsed() + " seconds");
    }

    private static boolean isEven(long value) {
        return value % 2 == 0;
    }
}
