package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad5Test {
    @Test
    void n0() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(0, object.climbStairs(0));
    }
    @Test
    void lessThanZero() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(-1, object.climbStairs(-1));
    }

    @Test
    void n3() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(3, object.climbStairs(3));
    }

    @Test
    void n3TreeVersion() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(3, object.revokeClimbStairsRecurrencyStyle(3));
    }

    @Test
    void n3Quicker() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(3, object.climbStairsQuicker(3));
    }

    @Test
    void n4() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(5, object.climbStairsQuicker(4));
    }

    @Test
    void n5() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(8, object.climbStairsQuicker(5));
    }

    @Test
    void n6() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(13, object.climbStairs(6));
    }

    @Test
    void n6q() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(13, object.climbStairsQuicker(6));
    }
    @Test
    void n44() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(1134903170, object.climbStairs(44));
    }

    @Test
    void n45() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(1836311903, object.climbStairs(45));
    }

    @Test
    void n45Quicker() {
        Zad5 object = new Zad5();
        Assertions.assertEquals(1836311903, object.climbStairsQuicker(45));
    }

}
