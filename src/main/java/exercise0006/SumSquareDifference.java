package exercise0006;

import static _utils.Timer.*;

public class SumSquareDifference {

    public static void main(String[] args) {

        double sumOfSquares = 0D;
        double squareOfTheSum = 0D;

        startTimer();

        for (double i = 1; i <= 100; i++) {
            sumOfSquares = sumOfSquares + Math.pow(i, 2);
            squareOfTheSum = squareOfTheSum + i;
        }

        squareOfTheSum = Math.pow(squareOfTheSum, 2);
        stopTimer();

        System.out.println("Result: " + (squareOfTheSum - sumOfSquares) + " obtained in " + getTimeEllapsed() + " seconds.");
    }
}
