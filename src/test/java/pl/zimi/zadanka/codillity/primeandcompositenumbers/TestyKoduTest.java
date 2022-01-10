package pl.zimi.zadanka.codillity.primeandcompositenumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestyKoduTest {

    TestyKodu TestObject = new TestyKodu();

    @Test
    void testGetPeaks() {
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        Assertions.assertArrayEquals(TestObject.getPeaks(A), new int[]{3, 5, 10});
        int[] B = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        Assertions.assertArrayEquals(TestObject.getPeaks(B), new int[]{1});
    }

    @Test
    void testGetPeaks2() {

        int[] B = {1, 3, 2, 1};
        Assertions.assertArrayEquals(TestObject.getPeaks(B), new int[]{1});
    }

    @Test
    void testTestBlock() {

        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        Assertions.assertEquals(TestObject.testBlock(TestObject.getPeaks(A), A, 3, 4), 1);
    }

    @Test
    void testFindSmallestBlock() {

        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        Assertions.assertEquals(TestObject.solution(A), 3);

    }

    @Test
    void testFindSmallestBlock2() {

        int[] a = {1, 3, 2, 1};
        Assertions.assertEquals(TestObject.solution(a), 1);

    }
}