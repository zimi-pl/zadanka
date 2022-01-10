package pl.zimi.zadanka.codillity.sorting;

import java.util.*;

public class MaxProductOfThree {
    public int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);
        int resultTwoMinus = 0;
        int resultTripplePlus = 0;
        // +++
        resultTripplePlus = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        // --+
        resultTwoMinus = A[0] * A[1] * A[A.length - 1];

        return Math.max(resultTripplePlus, resultTwoMinus);
    }
}




