package pl.zimi.zadanka;

import java.util.*;

public class Zad18 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> MapNums1 = new HashMap<>();
        List<Integer> findings = new ArrayList<>();
        int[] array = new int[0];
        int[] askingArray = new int[0];

        if (nums1.length > nums2.length) {
            array = nums1.clone();
            askingArray = nums2.clone();
        }
        else{
            array = nums2.clone();
            askingArray = nums1.clone();
        }

        for (int i : array) {

            if (!MapNums1.containsKey(i))
                MapNums1.put(i, 1);
            else {
                MapNums1.put(i, MapNums1.get(i) + 1);
            }
        }

        for (int i : askingArray) {
            for (Map.Entry<Integer, Integer> entry1 : MapNums1.entrySet()) {
                if (i == entry1.getKey() && entry1.getValue()!=0) {
                    findings.add(i);
                    entry1.setValue(entry1.getValue()-1);
                }
            }
        }
//        System.out.println(findings+" "+ MapNums1);
        return findings.stream().mapToInt(i -> i).toArray();
    }
}
