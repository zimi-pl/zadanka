package pl.zimi.zadanka;

public class Zad9 {
    public ListNode swapPairs(ListNode listNode) {
        if (listNode== null || listNode.next == null)
            return listNode;
        ListNode left = listNode;
        ListNode right = listNode.next;
        ListNode rightRight = null;
        if (listNode.next.next != null) {
            rightRight =swapPairs(listNode.next.next);
        }
        left.next = rightRight;
        right.next = left;
        listNode = right;

        return listNode;
    }
}
