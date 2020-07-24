package exercise0002;

import static _utils.Timer.*;
import static _utils.ModuleOperations.isDivisible;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        long sum = 2;
        long firstTerm = 1;
        long secondTerm = 2;
        long nextTerm = 0;

        startTimer();

        while (nextTerm <= 4000000) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            if (isDivisible(nextTerm, 2)) {
                sum = sum + nextTerm;
            }
        }

        stopTimer();
        System.out.println("Result: " + sum + " obtained in " + getTimeEllapsed() + " seconds");
    }
}
