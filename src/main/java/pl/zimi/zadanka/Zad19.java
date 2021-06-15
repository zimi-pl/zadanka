package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
source:
https://leetcode.com/problems/subsets/
 */
public class Zad19 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outputList = new ArrayList<>();
        outputList.add(new ArrayList<>());
        if (nums.length > 0) {
            outputList.add(new ArrayList<>(Arrays.asList(nums[0])));
            List<Integer> temp;
            int numberOfElements = nums.length;
            for (int incTemp = 1; incTemp < numberOfElements; incTemp++) {
                int size = outputList.size();
                for (int inc = 0; inc < size; inc++) {
                    temp = new ArrayList<>(outputList.get(inc));
                    temp.add(nums[incTemp]);
                    outputList.add(temp);
                }
            }
            outputList.stream().sorted();
        }
        return outputList;
    }

    public List<List<Integer>> subsetsBinarySorted(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n= nums.length;

        for (int i = (int) Math.pow(2, nums.length); i < (int) Math.pow(2, nums.length + 1); ++i) {
//            generate bitmask, from 0..00 to 1..11

            String bitmask = Integer.toBinaryString(i);
            System.out.print("bit mask=" + bitmask + " ");
            bitmask = Integer.toBinaryString(i).substring(1);
            System.out.print("bit mask=" + bitmask + " ");

            System.out.println(i);
            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }
}

