package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Zad8Test {
    /**
    public static int revokeMaxDepth(Integer[] inputArray) {
        Zad8  test = new Zad8();
        TreeNode root = test.createTree(new TreeNode(), inputArray, 0);
        return test.maxDepth(root);
    }
     */
    public void revokeCreateListNode (int[] inputNodesList){
        Zad8 localClass = new Zad8();
        Zad8.ListNode listNode = localClass.new ListNode(0);
        listNode = createListNode(inputNodesList,listNode,0);
    }
    public Zad8.ListNode createListNode(int[] inputNodesList, Zad8.ListNode listNode, int i) {

        if (i != inputNodesList.length) {
            listNode.val = inputNodesList[i];
            listNode.next = createListNode(inputNodesList,listNode,++i);

        }

        return listNode;
    }
    @Test
    void dummyMethod(){
        revokeCreateListNode(new int[] {4,5,1,9});
//        new int[] {4,5,9}
        Assertions.assertEquals(0,0);

    }
}
