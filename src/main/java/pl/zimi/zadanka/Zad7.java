package pl.zimi.zadanka;

/*
    Source: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Zad7 {

    public static int maxDepth(TreeNode root) {

        return exploreRoot(root, 0, 0);
    }

    public static int exploreRoot(TreeNode root, int depth, int maxDepth) {
        depth++;
        if (root == null) return maxDepth;
//        System.out.println("node"+root.val+"depth="+depth+"maxDepth="+maxDepth);
        if (root.left != null) maxDepth = exploreRoot(root.left, depth, maxDepth);
        if (root.right != null) maxDepth = exploreRoot(root.right, depth, maxDepth);
        if (depth > maxDepth) maxDepth = depth;
//        System.out.println("maxDepth="+maxDepth);
        return maxDepth;
    }

    public static int intelijMaxDepth(Integer[] inputArray) {

        TreeNode root = CreateTree(new TreeNode(), inputArray, 0);

        return maxDepth(root);
    }


    public static TreeNode CreateTree(TreeNode tempRoot, Integer[] treeElements, int pointer) {

        if (pointer >= treeElements.length || treeElements[pointer] == null) return null;
        else if (tempRoot == null) return CreateTree(new TreeNode(treeElements[pointer]), treeElements, pointer);

        return new TreeNode(tempRoot.val,
                (CreateTree(tempRoot.left, treeElements, 2 * pointer + 1)),
                CreateTree(tempRoot.right, treeElements, 2 * pointer + 2));
    }

    public static void presentTree(Integer[] treeElements) {

        List<TreeNode> Tree = new ArrayList<>();
        List<Integer[]> levelElements = new ArrayList<>();
        levelElements.add(new Integer[]{treeElements[0]});

        int level = 0;

        int nextLevel = 0;
        int iLevel = 0;

        int remainedElements = treeElements.length - level;
        while (level < remainedElements) {
            level = (int) Math.pow(2, iLevel);
            nextLevel = (int) Math.pow(2, ++iLevel);
            remainedElements = treeElements.length - level;
            levelElements.add(Arrays.copyOfRange(treeElements, level - 1, nextLevel - 1));

            System.out.print("Level" + iLevel + " ");
            System.out.println(Arrays.toString(levelElements.get(levelElements.size() - 1)));
            System.out.println();
        }
    }

    public static int printTemplateTree(int start, int end) {
        int i = (int) Math.pow(2, start);
        int k = (int) Math.pow(2, start);
        while (i-- > 0) {
            System.out.print((k++) + " ");
        }
        System.out.println();
        if (start == end) {
            return 0;
        }
        return printTemplateTree(++start, end);
    }

    public static int sumaRekurencja(int n) {
        if (n > 0) {

            int y = n + sumaRekurencja(n - 1);
            System.out.println(y);
            return y;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

//        Zad7 dummy = new Zad7();
        Integer[] inputArray = {0, 1, 2, null, null, 5, 6};
        presentTree(inputArray);

//        TreeNode root = null;
//        root = CreateTree(root, inputArray, 0);
//        int x = intelijMaxDepth(inputArray);
    }


}

