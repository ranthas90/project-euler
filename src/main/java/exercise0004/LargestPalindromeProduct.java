package exercise0004;

import static _utils.Palindrome.isPalindrome;
import static _utils.Timer.*;

public class LargestPalindromeProduct {

    public static void main(String[] args) {

        startTimer();

        int value = 0;
        int largestValue = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                value = i * j;
                if (isPalindrome(value) && (value > largestValue)) {
                    largestValue = value;
                }
            }
        }

        stopTimer();
        System.out.println("Result: " + largestValue + " obtained in " + getTimeEllapsed() + " seconds.");
    }
}
