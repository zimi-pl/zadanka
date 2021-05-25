package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad14Test {
    @Test
    void dummyTest() {
        Zad14 object = new Zad14();
        int actualResult = object.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    void firstTestLeetCode() {
        Zad14 object = new Zad14();
        int actualResult = object.majorityElement(new int[]{3, 2, 3});
        Assertions.assertEquals(3, actualResult);
    }
}
