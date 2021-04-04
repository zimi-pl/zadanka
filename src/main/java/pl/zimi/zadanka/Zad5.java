package pl.zimi.zadanka;

/**
 * source:
 * https://leetcode.com/problems/climbing-stairs/
 */

public class Zad5 {

    // rozwiązanie poprawne ale wolne
    public static int revokeClimbStairsRecurrencyStyle(int lastStairNumber) {
        return climbStairsRecurrencyStyle(lastStairNumber, 0, 0);
    }

    private static int climbStairsRecurrencyStyle(int lastStairNumber, int currentValue, int carry) {
        if (currentValue == lastStairNumber) {
            return ++carry;
        }
        if (currentValue > lastStairNumber) {
            return 0;
        } else {
            return climbStairsRecurrencyStyle(lastStairNumber, currentValue + 1, carry)
                    + climbStairsRecurrencyStyle(lastStairNumber, currentValue + 2, carry);
        }
    }

    // rozwiązanie poprawne ale za wolne
    public static int climbStairs(int stairNumber) {
        if (stairNumber == 0) {
            return 0;
        }
        if (stairNumber == 1) {
            return 1;
        }
        if (stairNumber == 2) {
            return 2;
        }
        if (stairNumber > 2) {
            return climbStairs(stairNumber - 2) + climbStairs(stairNumber - 1);
        }
        if (stairNumber < 0) {
            throw new IllegalArgumentException("input variable StairNumber cannot be less than 0");
        }
        return 0;
    }

    // rozwiazanie przyjete przez leetcode
    public static int climbStairsQuicker(int lastStairNumber) {
        if (lastStairNumber == 2) {
            return 2;
        }
        if (lastStairNumber == 1) {
            return 1;
        }
        int thirdValue = 0;
        int secondValue = 2;
        int firstValue = 1;
        for (int iterVal = 3; iterVal <= lastStairNumber; iterVal++) {
            thirdValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = thirdValue;
        }
        return thirdValue;

    }
}
