package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad18Test {
    @Test
    void dummyTest(){
        Assertions.assertEquals(1,1);
    }
    @Test
    void firstLeetExample(){
        Zad18 object = new Zad18();
        object.intersect(new int[]{1,2,2,1},new int[]{2,2});

        Assertions.assertEquals(1,1);
    }
    @Test
    void secondLeetExample(){
        Zad18 object = new Zad18();
        object.intersect(new int[]{4,9,5},new int[]{9,4,9,8,4});

        Assertions.assertEquals(1,1);
    }
}
