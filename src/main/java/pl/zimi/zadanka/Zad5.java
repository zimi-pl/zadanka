package pl.zimi.zadanka;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * source:
 * https://leetcode.com/problems/climbing-stairs/
 */

public class Zad5 {

    // rozwiązanie poprawne ale wolne
    public static int climbStairsTreeStyle(int key, int currentValue, int carry) {
        if (currentValue == key) {
            return ++carry;
        }
        if (currentValue > key) {
            return 0;
        } else {
            return climbStairsTreeStyle(key, currentValue + 1, carry)
                    + climbStairsTreeStyle(key, currentValue + 2, carry);
        }
    }

    // rozwiązanie poprawne ale za wolne
    public static int climbStairs(int key) {
        if (key > 0) {
            if (key == 1) {
                return 1;
            }
            if (key == 2) {
                return 2;
            }
            return climbStairs(key - 2) + climbStairs(key - 1);
        } else {
            return 0;
        }
    }

    // rozwiazanie przyjete przez leetcode
    public static int climbStairsQuicker(int key) {
        if (key == 2) {
            return 2;
        }
        if (key == 1) {
            return 1;
        }
        int thirdValue = 0;
        int secondValue = 2;
        int firstValue = 1;
        int iterVal = 3;
        while (iterVal++ <= key) {
            thirdValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = thirdValue;
        }
        return thirdValue;

    }
}
