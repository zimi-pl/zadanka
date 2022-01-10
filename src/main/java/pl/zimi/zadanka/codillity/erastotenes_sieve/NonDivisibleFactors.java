package pl.zimi.zadanka.codillity.erastotenes_sieve;

import java.util.stream.IntStream;

public class NonDivisibleFactors {
    private static int[] getNonDivisibleFactors(int[] A) {
        int lenA = A.length;
        int[] results = new int[A.length];

        int maxValInA = IntStream
                .of(A).max()
                .orElse(0);
        int[] counts = new int[maxValInA + 1];

        for (int aPointer = 0; aPointer < A.length; ++aPointer) {
            counts[A[aPointer]] += 1;
        }
        for (int i = 0; i < lenA; i++) {
            int divisiors = 0;
            for (int j = 1; j * j <= A[i];++j) {

                if (A[i] % j == 0) {
                    divisiors += counts[j];
                    if (A[i] / j != j) {
                        divisiors += counts[A[i] / j];
                    }
                }
            }
            results[i] = lenA - divisiors;
        }
//        IntStream.of(results).forEach(System.out::println);
        return results;
    }

    public static void main(String[] args) {
        getNonDivisibleFactors(new int[]{30, 3, 1, 2, 3, 6});
    }
}
