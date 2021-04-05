package pl.zimi.zadanka;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class Zad8 {


    public class ListNode {
        int val;
        ListNode next;

//        ListNode () {}
        ListNode(int x) {
            val = x;
        }
    }

   /* public static TreeNode createTree(TreeNode tempRoot, Integer[] treeElements, int pointer) {

        if (pointer >= treeElements.length || treeElements[pointer] == null) return null;
        else if (tempRoot == null) return createTree(new TreeNode(treeElements[pointer]), treeElements, pointer);

        return new TreeNode(tempRoot.val,
                (createTree(tempRoot.left, treeElements, 2 * pointer + 1)),
                createTree(tempRoot.right, treeElements, 2 * pointer + 2));
    }*/


    public void deleteNode(ListNode Treenode) {

    }


}
