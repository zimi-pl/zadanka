package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad23Test {
    @Test
    void dummyfoo() {
        Zad23 solution = new Zad23();
        String[] strs = {"flower", "flow", "flight"};
        Assertions.assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    void secondTest() {
        Zad23 solution = new Zad23();
        String[] strs = {"dog","racecar","car"};
        Assertions.assertEquals("", solution.longestCommonPrefix(strs));
    }
}


