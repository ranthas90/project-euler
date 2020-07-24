package exercise0001;

import static _utils.ModuleOperations.isDivisible;
import static _utils.Timer.*;

public class MultiplesOfThreeAndFive {

    public static void main(String[] args) {

        int sum = 0;

        startTimer();

        for (int i = 3; i < 1000; i++) {
            if (isDivisible(i, 3) || isDivisible(i, 5)) {
                sum = sum + i;
            }
        }

        stopTimer();
        System.out.println("Result: " + sum + " obtained in " + getTimeEllapsed() + " seconds.");
    }
}