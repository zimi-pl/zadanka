package pl.zimi.zadanka;


import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class Zad10 {
    public class SwappingState {
        int k;
        int iterator;
        int iteratorMax;
        ListNode leftTempNode;
        ListNode rightTempNode;

        public SwappingState(int k) {
            this.k = k;
            this.iterator = 0;
            this.leftTempNode = null;
            this.rightTempNode = null;
        }
    }

    public ListNode swapNodes(ListNode head, int k) {
        SwappingState swappingState = new SwappingState(k);
        SwappingState resultSwappingState = swapNodesHelper(head, swappingState);
        return head;
    }

    public SwappingState swapNodesHelper(ListNode actualNode, SwappingState swappingState) {
        if (actualNode == null) {
            swappingState.iteratorMax = swappingState.iterator;
            return swappingState;
        }
        swappingState.iterator++;

        // before reaching last node ( first half of recurrent "swapNodes" method runtime)
        swappingState = swapNodesHelper(actualNode.next, swappingState);
        // after reaching last node ( second half of recurrent method runtime)
        // case if k pointer is in the left half of Nodelist
        if (swappingState.k > swappingState.iteratorMax / 2) {
            swappingState.k = swappingState.iteratorMax - swappingState.k + 1;
        }
        // snapping value of left node
        if (swappingState.iterator == swappingState.k) {
            swappingState.leftTempNode = actualNode;
        }
        // do nothing in case of odd-numbered nodelist with k-pointer set on center node
        if (swappingState.iteratorMax % 2 != 0 && swappingState.k == swappingState.iteratorMax / 2 + 1) {
            return swappingState;
        }
        // snapshot of right node
        if (swappingState.iterator == swappingState.iteratorMax - swappingState.k + 1) {
            swappingState.rightTempNode = actualNode;
        }
        // swapping nodes values
        if (swappingState.iterator == swappingState.k) {
            Integer temp = swappingState.leftTempNode.val;
            actualNode.val = swappingState.rightTempNode.val;
            swappingState.rightTempNode.val = temp;
        }
        swappingState.iterator--;
        return swappingState;
    }
}
