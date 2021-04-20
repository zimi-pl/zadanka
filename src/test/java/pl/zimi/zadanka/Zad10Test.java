package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Zad10Test {
    public ListNode revokeCreateListNode(Integer [] inputNodesList) {
        ListNode listNode = new ListNode(0);
        listNode = createListNode(inputNodesList, listNode, 0);
        return listNode;

    }

    public ListNode createListNode(Integer [] inputNodesList, ListNode listNode, int i) {
        if (inputNodesList.length == 0) {
            return null;
        }
        if (inputNodesList.length == 1) {
            listNode.val = inputNodesList[i];
            return listNode;
        }
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

    public ArrayList<Integer> ListNodeToArray(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList<>();
        ListNode tempListNode = listNode;
        while (tempListNode != null) {
            array.add(tempListNode.val);
            tempListNode = tempListNode.next;
        }
        return array;
    }

    @Test
    public void firstExample() {
        Zad10 obj = new Zad10();
        Integer inputArray[]= {1,2,3,4,5,6,7};
        ListNode listNodeInput = revokeCreateListNode(inputArray);
        obj.swapNodes(listNodeInput,2);
        Assertions.assertArrayEquals(new Integer[]{0}, new Integer []{0});
    }
}
