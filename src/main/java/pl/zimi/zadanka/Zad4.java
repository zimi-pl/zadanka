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
        String[] cleanedS = new String[splitedS.length];
        String sReverse = "";
        boolean flaga = true;
        int k = 0;
        int a = 32;
        char c = (char)a;
        for (int i = splitedS.length - 1; i >= 0; i--) {
            if (splitedS[i] != null) {
                if (splitedS[i] != "") {
                    if (splitedS[i] != " ") {
                        if(splitedS[i].charAt(0)!=c) {
                            System.out.println("splitedS[i]" + splitedS[i].length());
                            if (flaga == true) {
                                sReverse += splitedS[i];
                                flaga = false;
                            } else {
                                sReverse += " " + splitedS[i];
                            }
                            k++;
                        }

                    }
                }
            }

        }
        int t;
        for (int m = 0; m < sReverse.length(); m++) {
            t =sReverse.
            System.out.print(sReverse.charAt(m)+"="+t+" ");
        }
//        System.out.println(sReverse + sReverse.length());
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


        String sReverse = new String();
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
        for (String words : elements) {
            sReverse += words + " ";
            System.out.println(words);
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
        reverseString = klasa.reverseString("a good   example");
        reverseString = klasa.reverseString("  hello world  ");

    }
}
