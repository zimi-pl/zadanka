package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
    Source: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

public class Zad7Test {
    @Test
    void leetexampleTest1() {
        Zad7 test = new Zad7();
        Assertions.assertEquals(
                3,
                test.intelijMaxDepth(new Integer[]{3, 9, 20, null, null, 15, 7}));
    }

    @Test
    void myTest() {
        Zad7 test = new Zad7();
        Integer[] inputArray = {0, 1, 2, null, null, 5, 6};
        Assertions.assertEquals(3, test.intelijMaxDepth(inputArray));

    }

    @Test
    void Test() {
        Zad7 test = new Zad7();
        Integer[] inputArray = {0, 1, 2, 3, 4, 5, 6};
        Assertions.assertEquals(3, test.intelijMaxDepth(inputArray));

    }

    @Test
    void leetexampleTest2() {
        Zad7 test = new Zad7();
        Integer[] inputArray = {1, null, 2};
        Assertions.assertEquals(
                2, test.intelijMaxDepth(new Integer[]{1, null, 2}));
    }

    @Test
    void leetexampleTest3() {
        Zad7 test = new Zad7();
        Integer[] inputArray = {};
        Assertions.assertEquals(
                0, test.intelijMaxDepth(new Integer[]{}));
    }

}
