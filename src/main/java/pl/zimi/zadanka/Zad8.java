package pl.zimi.zadanka;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class Zad8 {

    public void deleteNode(ListNode listNode) {
        ListNode tempListNode = listNode.next;
        listNode = tempListNode;

    }

    public void deleteNodeLeetcode(ListNode listNode) {
        listNode.val = listNode.next.val;
        listNode.next = listNode.next.next;
    }


}
