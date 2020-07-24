package exercise0003;

import static _utils.Timer.*;
import static _utils.ModuleOperations.isDivisible;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        long factor = 2;
        long number = 600851475143L;

        startTimer();

        while (number > factor) {

            if (isDivisible(number, factor)) {
                number = number / factor;
            }

            while (isDivisible(number, factor)) {
                number = number / factor;
            }

            factor = factor + 1;
        }

        stopTimer();
        System.out.println("Result: " + number + " obtained in " + getTimeEllapsed());
    }
}
