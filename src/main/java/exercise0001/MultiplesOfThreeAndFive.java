package exercise0001;

import _utils.Timer;

public class MultiplesOfThreeAndFive {

    public static void main(String[] args) {

        int sum = 0;

        Timer.startTimer();

        for (int i = 3; i < 1000; i++) {
            if (isThreeMultiplier(i) || isFiveMultiplier(i)) {
                sum = sum + i;
            }
        }

        Timer.stopTimer();
        System.out.println("Result: " + sum + " obtained in " + Timer.getTimeEllapsed() + " seconds.");
    }

    private static boolean isThreeMultiplier(int value) {
        return value % 3 == 0;
    }

    private static boolean isFiveMultiplier(int value) {
        return value % 5 == 0;
    }
}