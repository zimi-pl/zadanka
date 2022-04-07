package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad34Test {
    @Test
    void one(){
        Zad34 obj = new Zad34();
        obj.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2},2);
        System.out.println();
        obj.removeElement2(new int[]{0, 1, 2, 2, 3, 0, 4, 2},2);
//        Assertions.assertArrayEquals(new int[]{0, 1, 4, 0, 3},);
    }
}
