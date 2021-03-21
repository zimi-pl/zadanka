package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad3Test {
    @Test
    void checkZero(){
        Zad3 object = new Zad3();
        Assertions.assertEquals(false,object.checkPowerOfTen(0));
    }

    @Test
    void checkOne() {

        Zad3 object = new Zad3();


        Assertions.assertEquals(true, object.checkPowerOfTen(1));

    }

    @Test
    void check7() {
        Zad3 object = new Zad3();
        Assertions.assertEquals(false, object.checkPowerOfTen(7));

    }

    @Test
    void check10(){
        Zad3 object = new Zad3();
                Assertions.assertEquals(true,object.checkPowerOfTen(10));
    }
    @Test
    void check100(){
        Zad3 object = new Zad3();
        Assertions.assertEquals(true,object.checkPowerOfTen(100));
    }
    @Test
    void check500(){
        Zad3 object = new Zad3();
        Assertions.assertEquals(false,object.checkPowerOfTen(500));
    }
    @Test
    void checkminus10(){
        Zad3 object = new Zad3();
        Assertions.assertEquals(false,object.checkPowerOfTen(-100));
    }


}
