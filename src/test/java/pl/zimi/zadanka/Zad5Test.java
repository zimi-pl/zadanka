package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad5Test {
    @Test
    void n3 ()
    {
        Zad5 object = new Zad5();
        Assertions.assertEquals(3,object.climbStairs(3));
    }
}
