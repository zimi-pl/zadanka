package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//https://leetcode.com/problems/container-with-most-water/
public class Zad30Test {
    @Test
    void dummy() {
        Zad30 solution = new Zad30();
        Assertions.assertEquals(
                solution.bruteForce(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}),
                solution.twoPoint(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
    @Test
    void oneOne() {
        Zad30 solution = new Zad30();
        Assertions.assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }
    @Test
    void thirdTest() {
        Zad30 solution = new Zad30();
        Assertions.assertEquals(16, solution.maxArea(new int[]{4,3,2,1,4}));
    }
    @Test
    void fourthTest() {
        Zad30 solution = new Zad30();
        Assertions.assertEquals(2, solution.maxArea(new int[]{1,2,1}));
    }
}
