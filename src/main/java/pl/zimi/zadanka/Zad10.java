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
        int[] temps = {k, 0, 0};
        SwappingState swappingState = new SwappingState(k);
        SwappingState resultSwappingState = swapNodesHelper(head, temps, swappingState);
        return head;
    }

    public SwappingState swapNodesHelper(ListNode actualNode, int[] temps, SwappingState swappingState) {
        if (actualNode == null) {
            temps[2] = temps[1];
            swappingState.iteratorMax = swappingState.iterator;
            return swappingState;
        }
        swappingState.iterator++;
        // before reaching max
        if (swappingState.iterator == swappingState.k)
            swappingState.leftTempNode = actualNode;

        swappingState = swapNodesHelper(actualNode.next, temps, swappingState);
        // after reaching max
        // case where Nodelist has only two nodes
        // case where k is median in Nodelist with odd number of nodes
        if (swappingState.iteratorMax % 2 != 0 && swappingState.k == swappingState.iteratorMax / 2 + 1) {
            return swappingState;
        } else {
            if (swappingState.iteratorMax - swappingState.iterator + 1 == swappingState.k) {
                swappingState.rightTempNode = actualNode;
            }
            if (swappingState.iteratorMax - swappingState.iterator == swappingState.k) {
                actualNode.next = swappingState.leftTempNode;
            }
            if (swappingState.iterator == swappingState.k - 1) {
                actualNode.next = swappingState.rightTempNode;
                ListNode tempNode = swappingState.rightTempNode.next;
                swappingState.rightTempNode.next = swappingState.leftTempNode.next;
                swappingState.leftTempNode.next = tempNode;
            }
        }
        swappingState.iterator--;
        return swappingState;
    }
}
