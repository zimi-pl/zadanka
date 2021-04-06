package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Zad8Test {
    public ListNode revokeCreateListNode(int[] inputNodesList, int headpointer) {
        ListNode listNode = new ListNode(0);
        listNode = createListNode(inputNodesList, listNode, 0);
        ListNode tempNode = listNode;
        while (tempNode.val != headpointer && tempNode.next != null) {
            tempNode = tempNode.next;
        }
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
    void dummyMethod() {
        Zad8 zad8Obj = new Zad8();
        ListNode node = revokeCreateListNode(new int[]{4, 5, 1, 9}, 5);
        ListNode nodeLeetcode = revokeCreateListNode(new int[]{4, 5, 1, 9}, 5);

        zad8Obj.deleteNode(node);
        printListNode(node);
//        po zakonczeniu metody deleteNode nie zmienia swojej postaci dalej 4,5,1,9

        zad8Obj.deleteNodeLeetcode(nodeLeetcode);
        printListNode(nodeLeetcode);
//      metoda deleteNodeLeetCode powoduje zmianę obiektu w sposób "trwały


        Assertions.assertEquals(0, 0);
    }
}
