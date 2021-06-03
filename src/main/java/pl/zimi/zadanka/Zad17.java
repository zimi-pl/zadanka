package pl.zimi.zadanka;
/*
source:
https://leetcode.com/problems/reverse-words-in-a-string/
 */

public class Zad17 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] tab, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode tree = new TreeNode(tab[mid]);
        tree.left = helper(tab, low, mid - 1);
        tree.right = helper(tab, mid + 1, high);

        return tree;
    }

    public TreeNode sortedArrayToBST2(int[] nums) {
        nums = revertArray(nums);

        // one element array case
        if (nums.length == 1) {
            return new TreeNode(nums[0], null, null);
        }
        // two element array case
        if (nums.length == 2) {
            return new TreeNode(nums[0], new TreeNode(nums[1]), null);
        }
        int leftLength = (nums.length - 1) / 2;
        int rightLength = (nums.length - 1) - leftLength;

        int[] left = new int[leftLength];
        for (int i = 0; i < leftLength; i++) {
            left[i] = nums[i];
        }
        int[] right = new int[rightLength];
        for (int i = 0; i < rightLength; i++) {
            right[i] = nums[i + leftLength + 1];
        }

        return new TreeNode(nums[leftLength], helper2(right, 0), helper2(left, 0));
    }

    public int[] revertArray(int[] array) {
        int[] revertedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            revertedArray[array.length - 1 - i] = array[i];
        }
        return revertedArray;
    }

    public TreeNode helper2(int[] tab, int depth) {
        TreeNode tree = new TreeNode();
        if (depth == tab.length - 1) {
            return new TreeNode(tab[depth]);
        }
        if (depth < tab.length - 1) {
            tree = new TreeNode(tab[depth], helper2(tab, depth + 1), null);
        }

        return tree;
    }
}
