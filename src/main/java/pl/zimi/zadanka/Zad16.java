package pl.zimi.zadanka;

import org.w3c.dom.NodeList;

import java.util.*;

public class Zad16 {
    public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public ListNode reverseList(ListNode head) {
        return helper2(head, new ArrayList());
    }

    public ListNode helper2(ListNode input, List visitedNodes) {
        ListNode head = new ListNode();
        if (input.next != null) {
            visitedNodes.add(input.val);
            head = helper2(input.next, visitedNodes);
        } else {
            head = new ListNode(input.val, helper3(visitedNodes.listIterator(visitedNodes.size())));
        }
        return head;
    }

    public ListNode helper3(ListIterator visitedNodesIter) {
        ListNode node = new ListNode();
        if (visitedNodesIter.hasPrevious()) {
            node = new ListNode((Integer) visitedNodesIter.previous(), helper3(visitedNodesIter));
        } else {
            return null;
        }
        return node;
    }
}
