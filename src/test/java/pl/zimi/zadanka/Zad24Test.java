package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad24Test {
    @Test
    void dummy1Test() {
        Zad24 solution = new Zad24();
        Assertions.assertEquals(true, solution.isValid("()"));
    }
    @Test
    void dummy2Test() {
        Zad24 solution = new Zad24();
        Assertions.assertEquals(true, solution.isValid("[]"));
    }
    @Test
    void firstTest() {
        Zad24 solution = new Zad24();
        Assertions.assertEquals(true, solution.isValid("()[]{}"));
    }
    @Test
    void fifthTest() {
        Zad24 solution = new Zad24();
        Assertions.assertEquals(true, solution.isValid("{[]}"));
    }
    @Test
    void anotherTest() {
        Zad24 solution = new Zad24();
        Assertions.assertEquals(false, solution.isValid("){"));
    }
}


