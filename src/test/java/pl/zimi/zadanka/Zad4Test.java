package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad4Test {
    @Test
    void checkstring() {

        Zad4 object = new Zad4();

        Assertions.assertEquals("blue is sky the", object.reverseString("the sky is blue"));

    }
    @Test
    void checkspaces() {

        Zad4 object = new Zad4();

        Assertions.assertEquals("example good a", object.reverseString("a good   example"));

    }
    @Test
    void helloWorld(){
        Zad4 object = new Zad4();
        Assertions.assertEquals("world hello",object.reverseString("  hello world  "));
    }
    @Test
    void nullString(){
        Zad4 object = new Zad4();
        Assertions.assertEquals(null,object.reverseString(null));
    }
}
