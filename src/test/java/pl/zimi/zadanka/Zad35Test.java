package pl.zimi.zadanka;

import org.junit.jupiter.api.Test;

public class Zad35Test {
    @Test
    void latawiec() {
        Zad35 obj = new Zad35();
        System.out.println("Zad35Test.latawiec");
        System.out.println(obj.strStr("latawiec", "lata"));
        ;
    }

    @Test
    void hello() {
        Zad35 obj = new Zad35();
        System.out.println("Zad35Test.hello");
        System.out.println(obj.strStr("hello", "ll"));
    }

    @Test
    void aaaaaa() {
        Zad35 obj = new Zad35();
        System.out.println("Zad35Test.aaaaaa");
        System.out.println(obj.strStr("aaaaa", "bba"));
    }

    @Test
    void mississipi() {
        Zad35 obj = new Zad35();
        System.out.println("Zad35Test.mississipi");
        System.out.println(obj.strStr("mississipi", "issip"));
    }

    @Test
    void mississippi() {
        Zad35 obj = new Zad35();
        System.out.println("Zad35Test.mississipi");
        System.out.println(obj.strStr("mississippi", "issip"));
    }
//    @Test
//    void mississipi2() {
//        Zad35 obj = new Zad35();
//        String haystack = "mississipi";
//        String needle = "issip";
//
//        System.out.println(obj.strStr2(haystack, needle));
//    }
//    @Test
//    void mississipi3() {
//        Zad35 obj = new Zad35();
//        String haystack = "missississipi";
//        String needle = "ssissip";
//
//        System.out.println(obj.strStr2(haystack, needle));
//
//    }

}
