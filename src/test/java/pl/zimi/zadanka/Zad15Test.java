package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad15Test {

    TreeNode createTree(List treeTopology) {

        TreeNode createdTree = new TreeNode();
        createdTree = recursiveAddition(createdTree, treeTopology, 0);
        return createdTree;
    }

    TreeNode recursiveAddition(TreeNode Root, List treeTopology, int depthPointer) {
        if (depthPointer >= treeTopology.size()) {
            return null;
        }
        if (treeTopology.get(depthPointer) == null) {
            return null;
        }
        TreeNode tempTree = new TreeNode((int) treeTopology.get(depthPointer),
                recursiveAddition(Root, treeTopology, 2 * depthPointer + 1),
                recursiveAddition(Root, treeTopology, 2 * depthPointer + 2));
        return tempTree;
    }

    @Test
    void firstExampleLeetCode2() {
        Zad15 object = new Zad15();
        TreeNode tree = createTree(Arrays.asList(1, 2, 3, null, null,6));
        List <Integer> expectedResult = new ArrayList<>(Arrays.asList(2,1,6,3));
        Assertions.assertEquals(expectedResult, object.inorderTraversal(tree));
    }
}
