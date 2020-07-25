package _utils;

public class Palindrome {

    public static boolean isPalindrome(int value) {
        return isPalindrome(Integer.toString(value));
    }

    public static boolean isPalindrome(String value) {
        return value.equals(new StringBuilder(value).reverse().toString());
    }
}
