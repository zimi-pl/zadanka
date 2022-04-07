package pl.zimi.zadanka;

//https://leetcode.com/problems/remove-element/
public class Zad34 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + ",");
        }

        return i;
    }
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + ",");
        }
        return n;
    }
}
