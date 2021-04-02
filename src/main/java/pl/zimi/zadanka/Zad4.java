package pl.zimi.zadanka;


/*
source
https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Zad4 {
    public static String reverseString(String s) {
        if (s == null) return null;
        if (s.equals("")) return "";
        String[] words = s.split(" ");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) reversedString += " " + words[i];
        }
        return reversedString = reversedString.substring(1, reversedString.length());
    }
}
