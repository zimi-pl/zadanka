package pl.zimi.zadanka;

import java.util.*;

//https://leetcode.com/problems/custom-sort-string/
public class Zad31 {
    public String customSortString(String order, String str) {
        Map<Integer, Character> orderDictionary = new HashMap<>();
        Map<Character, Integer> populationList = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderDictionary.put(i, order.charAt(i));
        }
        String rest = "";
        for (int i = 0; i < str.length(); i++) {
            if (orderDictionary.containsValue(str.charAt(i))) {
                if (!populationList.containsKey(str.charAt(i))) {
                    populationList.put(str.charAt(i), 1);
                } else {
                    populationList.replace(str.charAt(i), populationList.get(str.charAt(i)) + 1);
                }
            } else {
                rest += str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < orderDictionary.size(); i++) {
            Character temp = orderDictionary.get(i);
            if (populationList.containsKey(temp)) {
                for (int j = 0; j < populationList.get(temp); j++) {
                    result += temp;
                }
            }
        }
        result += rest;
        return result;
    }

    public String customSortStringLeetCode(String S, String T) {
        int[] count = new int[26];
        for (char c : T.toCharArray()) {
            ++count[c - 'a'];
        }  // count each char in T.
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            while (count[c - 'a']-- > 0) {
                sb.append(c);
            }    // sort chars both in T and S by the order of S.
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) {
                sb.append(c);
            }    // group chars in T but not in S.
        }
        return sb.toString();
    }
}
