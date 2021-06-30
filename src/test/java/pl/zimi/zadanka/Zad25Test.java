package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Zad25Test {
    ListNode createListNode(int[] inputArray) {
        ListNode node;
        if (inputArray == null) {
            return null;
        } else {
            node = new ListNode(inputArray[0]);
            ListNode currentNode=node;
            for (int i =1; i<inputArray.length;i++) {
                currentNode.next=new ListNode(inputArray[i]);
                currentNode=currentNode.next;
            }

        }
        return node;
    }

    @Test
    void dummyTest() {
        Zad25 solution = new Zad25();
        ListNode x = createListNode(new int[]{1, 2, 3, 4});
        Assertions.assertEquals(1, 1);
    }
}
