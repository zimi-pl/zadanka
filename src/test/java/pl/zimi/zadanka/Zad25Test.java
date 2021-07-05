package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/merge-two-sorted-lists/
public class Zad25Test {
    List printAndMakeArrayOfNodes(ListNode result) {
        List<Integer> array = new ArrayList<>();
        while (result != null) {
            System.out.println(result.val);
            array.add(result.val);
            result = result.next;
        }
        return array;
    }

    ListNode createListNode(int[] inputArray) {
        ListNode node;
        if (inputArray.length == 0) {
            return null;
        } else {
            node = new ListNode(inputArray[0]);
            ListNode currentNode = node;
            for (int i = 1; i < inputArray.length; i++) {
                currentNode.next = new ListNode(inputArray[i]);
                currentNode = currentNode.next;
            }

        }
        return node;
    }

    @Test
    void dummyTest() {
        Zad25 solution = new Zad25();
        ListNode x = createListNode(new int[]{0, 2, 4, 6, 8, 9, 10, 10, 10});
        ListNode y = createListNode(new int[]{1, 3, 5, 7, 9, 10});
        ListNode result = solution.mergeTwoLists(x, y);
        Assertions.assertEquals(
                Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 10, 10, 10),
                printAndMakeArrayOfNodes(result));
    }

    @Test
    void firstTest() {
        Zad25 solution = new Zad25();
        ListNode result = solution.mergeTwoLists(createListNode(new int[]{1, 2, 4}), createListNode(new int[]{1, 3, 4}));
        Assertions.assertEquals(Arrays.asList(1, 1, 2, 3, 4, 4), printAndMakeArrayOfNodes(result));
    }

    @Test
    void secondTest() {
        Zad25 solution = new Zad25();
        ListNode result = solution.mergeTwoLists(createListNode(new int[]{}), createListNode(new int[]{0}));
        Assertions.assertEquals(Arrays.asList(0), printAndMakeArrayOfNodes(result));
    }

    @Test
    void thirdTest() {
        Zad25 solution = new Zad25();
        ListNode result = solution.mergeTwoLists(
                createListNode(new int[]{}),
                createListNode(new int[]{}));
        Assertions.assertEquals(Arrays.asList(), printAndMakeArrayOfNodes(result));
    }
}
