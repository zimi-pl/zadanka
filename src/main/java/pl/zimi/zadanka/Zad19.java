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
}

