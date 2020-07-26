package exercise0005;

import _utils.LeastCommonMultiple;

import static _utils.Timer.*;

public class SmallestMultiple {

    public static void main(String[] args) {

        startTimer();
        int initialValue = 1;

        for (int i = 2; i <= 20; i++) {
            initialValue = (int) LeastCommonMultiple.getLeastCommonMultiple(i, initialValue);
        }

        stopTimer();
        System.out.println("Result: " + initialValue + " obtained in " + getTimeEllapsed() + " seconds.");

    }
}
