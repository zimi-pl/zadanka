package pl.zimi.zadanka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;

public class Zad16Test {

    private ListNode createListNodeChain(Iterator itr) {
        ListNode listNode = new ListNode();
        if (itr.hasNext()) {
            listNode = new ListNode((int) itr.next(), createListNodeChain(itr));
        } else {
            return null;
        }
        return listNode;
    }

    @Test
    public void dummyTest() {
        Zad16 object = new Zad16();
        object.reverseList(createListNodeChain(Arrays.asList(1, 2, 3, 4, 5, 6, 7).listIterator()));
        ListNode x =object.reverseList3(createListNodeChain(Arrays.asList(1, 2, 3, 4, 5, 6, 7).listIterator()));
        System.out.println(x);
    }
}
