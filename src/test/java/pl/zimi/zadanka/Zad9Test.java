package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad9Test {

    public ListNode revokeCreateListNode(int[] inputNodesList) {
        ListNode listNode = new ListNode(0);
        listNode = createListNode(inputNodesList, listNode, 0);
        return listNode;

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

    public ArrayList <Integer> ListNodeToArray(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList<>();
        ListNode tempListNode = listNode;
        while (tempListNode != null) {

            array.add(tempListNode.val);
            tempListNode = tempListNode.next;
        }
        return array;
    }


    @Test
    void testSwapPairs() {
        Zad9 zad9Obj = new Zad9();
        ListNode node = revokeCreateListNode(new int[]{1, 2, 3, 4, 5, 6});
        node = zad9Obj.swapPairs(node);
        ArrayList actualArrayList = ListNodeToArray(node);
        Integer [] expectedArray = {2,1,4,3,6,5};
        ArrayList expectedArrayList = new ArrayList <Integer>(Arrays.asList(expectedArray));
        Assertions.assertEquals(expectedArrayList,actualArrayList);
    }
}
