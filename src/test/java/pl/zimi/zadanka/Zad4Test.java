package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad4Test {
    @Test
    void checkstring() {

        Zad4 object = new Zad4();

        Assertions.assertEquals("blue is sky the", object.reverseString("the sky is blue"));

    }
}
