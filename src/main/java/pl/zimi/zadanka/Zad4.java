package pl.zimi.zadanka;


/*
source
https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class Zad4 {
    public static String reverseString(String s) {
        if (s == null) {
            return null;
        }
        String[] words = s.split(" ");
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {

//            if (words[i].length() > 0) {
//                if (flaga) {
//                    reversedString += " " + words[i];
//                } else {
//                    reversedString += words[i];
//                    flaga = true;
//                }
//
//            }
            if (!words[i].equals("")) reversedString += " " + words[i];
        }

        return reversedString = reversedString.substring(1, reversedString.length());
    }

    public static void main(String[] args) {
        System.out.println("main");
        Zad4 klasa = new Zad4();

        String reverseString = klasa.reverseString("the sky is blue");
        reverseString = klasa.reverseString("a good   example");
        reverseString = klasa.reverseString("  hello world  ");

    }
    /*
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
*/
}
