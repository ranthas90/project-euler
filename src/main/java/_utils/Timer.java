package _utils;

public class Timer {

    private static long startTimer;
    private static long endTimer;

    public static void startTimer() {
        startTimer = System.currentTimeMillis();
    }

    public static void stopTimer() {
        endTimer = System.currentTimeMillis();
    }

    public static float getTimeEllapsed() {
        return (endTimer - startTimer) / 1000F;
    }
}
