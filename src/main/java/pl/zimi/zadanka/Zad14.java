package pl.zimi.zadanka;
/*
source:
https://leetcode.com/problems/majority-element/
 */

import java.util.*;

public class Zad14 {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        int countMax = 0;
        int keyMax=0;

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            int count = occurrenceMap.containsKey(nums[i]) ? occurrenceMap.get(nums[i]) : 0;
            occurrenceMap.put(nums[i], ++count );
            if (countMax<count){
                countMax = count;
                keyMax = nums[i];
            }
        }
        return keyMax;
    }

}
