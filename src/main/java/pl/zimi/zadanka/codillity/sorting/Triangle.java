package pl.zimi.zadanka.codillity.sorting;

import java.util.Arrays;

public class Triangle {
    // nie dziala do konca, ale 60% jest.
    public int solution(int[] A) {
        if (A.length < 3) return 0;
        int result = 0;
        int startPosition = 0;
        Arrays.sort(A);

        for (int l = 0; l < A.length; l++) {
            if (A[l] > 0) {
                startPosition = l;
                break;
            }
        }
        for (int i = startPosition; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if (A[i] + A[j] > A[k] && A[k] + A[j] > A[i] && A[i] + A[k] > A[j]) {
                        return 1;
                    }
                }
            }
        }
        // System.out.println(elo);
        return result;
    }

}
