package pl.zimi.zadanka.codillity.primeandcompositenumbers;

public class Peaks {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        int[] getPeaks(int[] A) {
            int[] result = new int[A.length];
            int k = 0;
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i] > Math.max(A[i - 1], A[i + 1])) {
                    result[k] = i;
                    k++;
                }
            }
            int[] peaks = new int[k];
            for (int i = 0; i < k; i++) {
                peaks[i] = result[i];
            }
            return peaks;
        }

        int findSmallestBlock(int[] peaks, int[] A) {
            int candidateLenBlock = peaks.length;
            while (peaks.length % candidateLenBlock != 0) {
                candidateLenBlock--;
            }
            int lenBlock = A.length / candidateLenBlock;
            System.out.println("candidate" + candidateLenBlock + "len= " + lenBlock);
            int k = 0;

            for (int i = 0 + lenBlock; i <= A.length; i += lenBlock) {
                System.out.println("i=" + i);
                if (peaks[k] > i) {
                    System.out.println("brak");
                    break;
                } else {
                    if (peaks[k] >= i - lenBlock) {
                        k++;
                    }
                }
                if (k >= peaks.length) {
                    System.out.println("przekroczono k");
                    break;
                }
            }
            return 0;
        }

        public int solution(int[] A) {
            int[] peaks = getPeaks(A);
            for (int peak : peaks) {
                System.out.println(peak);
            }
            if (peaks.length < 1) return -1;
            if (peaks.length == 1) return 1;
            findSmallestBlock(peaks, A);
            return 0;
        }
    }
}
