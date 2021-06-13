package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

/*
source:
https://leetcode.com/problems/subsets/
 */

public class Zad19Test {
    @Test
    void dummymethod1() {
        Zad19 object = new Zad19();
        object.subsets(new int[]{2, 3, 4, 5, 6, 7});
        Assertions.assertEquals(1, 1);
    }

    @Test
    void nullCase() {
        Zad19 object = new Zad19();

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>());

        Assertions.assertEquals(expectedResult, object.subsets(new int[]{}));
    }

    @Test
    void oneElCase() {
        Zad19 object = new Zad19();

        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>());
        expectedResult.add(new ArrayList<>(Arrays.asList(1)));

        Assertions.assertEquals(expectedResult, object.subsets(new int[]{1}));
    }

}
