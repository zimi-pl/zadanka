package pl.zimi.zadanka;
/*
source:
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad17Test {
    boolean equals(TreeNode x, TreeNode y) {
        if ((x == null) && (y == null)) {
            return true;
        }
        return (!(x == null) && !(y == null)) && (x.val == y.val) && (equals(x.left) == equals(y.left)) &&
                (equals(x.right) == equals(y.right));
    }

    TreeNode createTree(Integer[] nums, int pointer) {
        if (pointer >= nums.length || nums[pointer] == null) {
            return null;
        }
        return new TreeNode(nums[pointer], createTree(nums, 2 * pointer + 1), createTree(nums, 2 * pointer + 2));
    }

    @Test
    public void dummyTest() {
        Zad17 object = new Zad17();
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void firstLeetExample() {
        Zad17 object = new Zad17();
        TreeNode solution = object.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        TreeNode expected = createTree(new Integer[]{0, -3, 9, -10, null, 5}, 0);
        Assertions.assertEquals(true, equals(solution, expected));
    }

    @Test
    public void twoElementsInputExample() {
        Zad17 object = new Zad17();
        TreeNode solution = object.sortedArrayToBST(new int[]{1,3});
        TreeNode expected = createTree(new Integer[]{1,3}, 0);
        Assertions.assertEquals(true, equals(solution, expected));
    }
}
