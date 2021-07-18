package pl.zimi.zadanka;

import java.util.*;

//https://leetcode.com/problems/custom-sort-string/
public class Zad31 {
    public String customSortString(String order, String str) {
        Map<Integer, Character> orderDictionary = new HashMap<>();
        Character leftElement = null;
        Character rightElement = null;
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
            if (populationList.containsKey(temp))
            {
                for (int j = 0; j < populationList.get(temp); j++) {
                    result += temp;
                }
            }
        }
        result+=rest;
        System.out.println("result = " + result);
//        for (var entry : orderDictionary.entrySet()) {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }

        return result;
    }
}
