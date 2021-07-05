package pl.zimi.zadanka;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class Zad25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode nodeTemp1 = l1;
        ListNode nodeTemp2 = l2;

        ListNode L3 = new ListNode(0);
        ListNode marker = L3;

        int tempVal = 0;
        while (nodeTemp1 != null || nodeTemp2 != null) {
            if (nodeTemp1 != null && (nodeTemp2 == null || nodeTemp1.val < nodeTemp2.val)) {
                tempVal = nodeTemp1.val;
                nodeTemp1 = nodeTemp1.next;
            } else {
                if (nodeTemp2 != null && (nodeTemp1 == null || nodeTemp1.val >= nodeTemp2.val)) {
                    tempVal = nodeTemp2.val;
                    nodeTemp2 = nodeTemp2.next;
                }
            }
            marker.next = new ListNode(tempVal);
            marker = marker.next;
        }
        L3 = L3.next;
        return L3;
    }
}