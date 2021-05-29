package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.List;

/*
source:
https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
public class Zad15 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        resultList = inorderTraversalHelper(root, resultList);
        return resultList;
    }

    public List<Integer> inorderTraversalHelper(TreeNode node, List resultList) {
        if (node != null) {
            inorderTraversalHelper(node.left, resultList);
            resultList.add(node.val);
            inorderTraversalHelper(node.right, resultList);
        }
        return resultList;
    }

}
