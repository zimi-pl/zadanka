package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
source
https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Zad4 {
    public static String reverseString(String s) {

        String sReverse = new String();
        List  <String> elements = new ArrayList<>();
        elements = Arrays.asList(s.split(" "));
        Collections.reverse(elements);
        for (String words : elements){
            sReverse +=words + " ";
        }
        sReverse =sReverse.substring(0,sReverse.length()-1);
        System.out.println(sReverse);

        return sReverse;
    }
    public static String reversechars(String s) {

        String sReverse = new String();
        sReverse += String.valueOf(' ');
        for (int head = 0; head < s.length(); head++) {
            sReverse += String.valueOf(s.charAt(s.length() - head - 1));
        }
        System.out.println(sReverse);
        return sReverse;
    }

    public static void main(String[] args) {
        System.out.println("main");
        Zad4 klasa = new Zad4();
        String reversedinput = klasa.reverseString("the sky is blue");

    }
}
