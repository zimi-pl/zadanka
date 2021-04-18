package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad9Test {

    public ListNode revokeCreateListNode(int[] inputNodesList) {
        ListNode listNode = new ListNode(0);
        listNode = createListNode(inputNodesList, listNode, 0);
        ListNode tempNode = listNode;
//        while (tempNode.val != headpointer && tempNode.next != null) {
//            tempNode = tempNode.next;
//        }
        return tempNode;

    }

    public ListNode createListNode(int[] inputNodesList, ListNode listNode, int i) {
        if (i != inputNodesList.length - 1) {
            listNode.val = inputNodesList[i];
            i++;
            listNode.next = createListNode(inputNodesList, new ListNode(inputNodesList[i]), i);
        }
        return listNode;
    }

    public String printListNode(ListNode listNode) {
        String listToOutput = "";
        listToOutput += listNode.val;
        ListNode tempListNode = listNode;
        while (tempListNode.next != null) {
            tempListNode = tempListNode.next;
            listToOutput += "," + tempListNode.val;
        }
        System.out.println(listToOutput);
        return listToOutput;
    }


    @Test
    void dummyMethodswapairs() {
        Zad9 zad8Obj = new Zad9();
        ListNode node = revokeCreateListNode(new int[]{1, 2, 3, 4, 5, 6});

        printListNode(node);
        Assertions.assertEquals(0, 0);
    }
}
