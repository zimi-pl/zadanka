package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad20Test {
    @Test
    void anagramTest(){
        Zad20 object = new Zad20();
        Assertions.assertEquals(true, object.isAnagram("anagram","nagaram"));
    }
    @Test
    void ratCatTest(){
        Zad20 object = new Zad20();
        Assertions.assertEquals(false, object.isAnagram("rat","cat"));
    }
    @Test
    void acbbTest(){
        Zad20 object = new Zad20();
        Assertions.assertEquals(false, object.isAnagram("ac","bb"));
    }
    @Test
    void aabbTest(){
        Zad20 object = new Zad20();
        Assertions.assertEquals(false, object.isAnagram("aa","bb"));
    }
}
