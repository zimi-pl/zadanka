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
        if(swappingState.k>swappingState.iteratorMax/2){
            swappingState.k = swappingState.iteratorMax- swappingState.k+1;
        }
        // after reaching last node ( second half of recurrent method runtime)
        if (swappingState.iterator == swappingState.k)
            swappingState.leftTempNode = actualNode;

        if (swappingState.iteratorMax % 2 != 0 && swappingState.k == swappingState.iteratorMax / 2 + 1) {
            return swappingState;
        }


        // case where Nodelist has only two nodes

            if (swappingState.iterator == swappingState.iteratorMax- swappingState.k+1) {
                swappingState.rightTempNode = actualNode;
            }
            if (swappingState.iterator == swappingState.k) {
                Integer temp = swappingState.leftTempNode.val;
                actualNode.val = swappingState.rightTempNode.val;
                swappingState.rightTempNode.val = temp;
                //             actualNode.val = swappingState.rightTempNode.val;
                //             actualNode.next = swappingState.leftTempNode;
                //             actualNode.next.next = null;
            }


        // case where NodeList has three elements and k = 1

        // case where k is median in Nodelist with odd number of nodes
//        if (swappingState.iteratorMax > 3) {
//            if (swappingState.iteratorMax % 2 != 0 && swappingState.k == swappingState.iteratorMax / 2 + 1) {
//                return swappingState;
//            } else {
//                // case where number of nodes is more than 3
//                if (swappingState.iteratorMax - swappingState.iterator + 1 == swappingState.k) {
//                    swappingState.rightTempNode = actualNode;
//                }
//                if (swappingState.iteratorMax - swappingState.iterator == swappingState.k) {
//                    actualNode.next = swappingState.leftTempNode;
//                }
//                if (swappingState.iterator == swappingState.k - 1) {
//                    actualNode.next = swappingState.rightTempNode;
//                    ListNode tempNode = swappingState.rightTempNode.next;
//                    swappingState.rightTempNode.next = swappingState.leftTempNode.next;
//                    swappingState.leftTempNode.next = tempNode;
//                }
//            }

        swappingState.iterator--;
        return swappingState;
    }
}
