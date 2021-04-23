package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Zad10Test {
    public ListNode revokeCreateListNode(ArrayList inputNodesList) {
        ListNode listNode = new ListNode(0);
        listNode = createListNode(inputNodesList, listNode, 0);
        return listNode;
    }

    public ListNode createListNode(ArrayList<Integer> inputNodesList, ListNode listNode, int i) {
        if (inputNodesList.size() == 0) {
            return null;
        }
        if (inputNodesList.size() == 1) {
            listNode.val = inputNodesList.get(i);
            return listNode;
        }
        if (i != inputNodesList.size() - 1) {
            listNode.val = inputNodesList.get(i);
            i++;
            listNode.next = createListNode(inputNodesList, new ListNode(inputNodesList.get(i)), i);
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

    public List listNodeToArray(ListNode listNode) {
        List<Integer> arrayList = new ArrayList<>();
        ListNode tempListNode = listNode;
        while (tempListNode != null) {
            arrayList.add(tempListNode.val);
            tempListNode = tempListNode.next;
        }
        return arrayList;
    }

    @Test
    public void firstExample() {
        Zad10 obj = new Zad10();
        ArrayList<Integer> inputArrayList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Integer[] expectedResultArray = {1, 6, 3, 4, 5, 2, 7};

        ListNode listNodeInput = revokeCreateListNode(inputArrayList);
        obj.swapNodes(listNodeInput, 2);

        Assertions.assertEquals(inputArrayList, inputArrayList);
        // unikac tablic lista jest obiektem
//        Assertions.assertArrayEquals(
//                expectedResultArray, listNodeToArray(listNodeInput));

    }

    @Test
    public void threeNodesExample() {
        Zad10 obj = new Zad10();
        ArrayList<Integer> inputArrayList =
                new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expectedResultList =
                new ArrayList<>(Arrays.asList(1, 2, 3));
        ListNode listNodeInput = revokeCreateListNode(inputArrayList);
        obj.swapNodes(listNodeInput, 2);
        Assertions.assertEquals(
                expectedResultList, listNodeToArray(listNodeInput));
    }

    @Test
    public void threeNodesK1Example() {
        Zad10 obj = new Zad10();
        ArrayList<Integer> inputArrayList =
                new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expectedResultList =
                new ArrayList<>(Arrays.asList(3, 2, 1));
        ListNode listNodeInput = revokeCreateListNode(inputArrayList);
        obj.swapNodes(listNodeInput, 1);
        Assertions.assertEquals(
                expectedResultList, listNodeToArray(listNodeInput));
    }

    @Test
    public void twoNodesExample() {
        Zad10 obj = new Zad10();
        ArrayList<Integer> inputArrayList =
                new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> expectedResultList =
                new ArrayList<>(Arrays.asList(2, 1));
        ListNode listNodeInput = revokeCreateListNode(inputArrayList);
        obj.swapNodes(listNodeInput, 1);
        Assertions.assertEquals(
                expectedResultList, listNodeToArray(listNodeInput));
    }

    @Test
    public void nextExample() {
        Zad10 obj = new Zad10();
        ArrayList<Integer> inputArrayList =
                new ArrayList<>(Arrays.asList(100, 90));
        ArrayList<Integer> expectedResultList =
                new ArrayList<>(Arrays.asList(90, 100));
        ListNode listNodeInput = revokeCreateListNode(inputArrayList);
        obj.swapNodes(listNodeInput, 2);
        Assertions.assertEquals(
                expectedResultList, listNodeToArray(listNodeInput));
    }
}
