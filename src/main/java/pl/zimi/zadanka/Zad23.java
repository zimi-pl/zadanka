package pl.zimi.zadanka;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.min;

/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class Zad23 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (!prefix.equals(strs[i])) {
                String temp = "";
                for (int j = 0; j < min(strs[i].length(), prefix.length()); j++) {
                    if (prefix.charAt(j) != strs[i].charAt(j)) {
                        break;
                    } else {
                        temp += strs[i].charAt(j);
                    }
                }
                prefix = temp;
            }
        }
        System.out.println("prefix = " + prefix);
        return prefix;
    }
}
