package pl.zimi.zadanka;

public class Zad35 {
    public int strStr(String haystack, String needle) {

        if (needle == null) return 0;
        int needleLen = needle.length();
        int haystackLen = haystack.length();

        if (needleLen > haystack.length()) {
            return -1;
        }

        char[] haystackchars = haystack.toCharArray();
        char[] needlechars = needle.toCharArray();

        for (int i = 0; i < haystackLen; i++) {
            for (int k = 0; k < needleLen; k++) {
                if (k + i == haystackLen) break;
                if (haystackchars[k + i] != needlechars[k]) {
                    break;
                }
                if (k == needleLen - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        System.out.print("haystack = " + haystack + ", needle = " + needle + " ");

        // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;


        for (int i = 0; i < haystack.length(); i++) {
            // no enough places for needle after i
            if (i + needle.length() > haystack.length()) break;

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
                if (j == needle.length() - 1)
                    return i;
            }
        }

        return -1;
    }
}
