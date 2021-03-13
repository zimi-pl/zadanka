package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.List;

/*
source
https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Zad4 {
    public static String reverseString(String s) {
        char c = s.charAt(0);
        String sReverse = new String();
        for (int head = 0; head < s.length(); head++) {
            sReverse += String.valueOf(s.charAt(s.length() - head - 1));
            System.out.println(sReverse);
        }
        System.out.println(sReverse);
        return sReverse;
    }

    public static void main(String[] args) {
        System.out.println("main");
//        System.out.println(new Zad2().missingNumber(inputNumbers.toArray(new Integer[inputNumbers.size()])));
        Zad4 klasa = new Zad4();
        String reversedinput= klasa.reverseString("string");

    }
}
