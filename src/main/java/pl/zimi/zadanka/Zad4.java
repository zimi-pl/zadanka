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

        String[] splitedS = s.split(" ");
        String sReverse = "";
        boolean flaga = false;
        for (int i = splitedS.length - 1; i >= 0; i--) {

            if (splitedS[i].length() > 0) {
//            if (true) {     //ten zostawia artefakty na koncu linii
                if (flaga == true) {
                    sReverse += " " + splitedS[i];
                } else {
                    sReverse += splitedS[i];
                    flaga = true;
                }
            }
        }
        return sReverse;
    }

    public static String reverseStringPROBLEMY(String s) {
        List<String> myAlist = new ArrayList<String>();
        myAlist.add("Geeks");
        myAlist.add("Practice");
        myAlist.add("Quiz");
        System.out.println("Original ArrayList : " + myAlist);
        myAlist.remove("Quiz");
        System.out.println("Modified ArrayList : " + myAlist);

        new ArrayList<>();
        List<String> elements = new ArrayList<>();
        String[] splitedS = s.split(" ");
//        List <String> bonus = new ArrayList<String>(Arrays.asList(splitedS));
//        elements.addAll(bonus);
        elements = Arrays.asList(splitedS);

        String whitespace = "good";
//        ??? czemu nie działa contains
//        elements.removeIf(n->n.contains(""));
        elements.remove("good");
//        elements.removeAll(Collections.singleton("good"));
//
        for (String k : elements) {
            if (k == "") {

                System.out.println("znalazłem goood " + k);
            }
        }
        Collections.reverse(elements);
        String sReverse = new String();
        StringBuilder sb = new StringBuilder();
        for (String words : elements) {
//            sReverse += words + " ";
            System.out.println(words);
            sb.append(words + " ");
        }
//        sReverse =sReverse.substring(0,sReverse.length()-1);
//        sReverse = sReverse.trim();
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

        String reverseString = klasa.reverseString("the sky is blue");
        System.out.println(reverseString);
        reverseString = klasa.reverseString("a good   example");
        System.out.println(reverseString);
        reverseString = klasa.reverseString("  hello world  ");
        System.out.println(reverseString);

    }
}
