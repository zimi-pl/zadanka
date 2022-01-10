package pl.zimi.zadanka.codillity.primeandcompositenumbers;

public class TestyKodu {
    int[] getPeaks(int[] A) {
        int[] result = new int[A.length];
        // int[]mask = new int[A.length];
        int k = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > Math.max(A[i - 1], A[i + 1])) {
                result[k] = i;
                k++;
            }
        }
        int[] peaks = new int[k];
        // mask[i] = 1;
        System.arraycopy(result, 0, peaks, 0, k);
        return peaks;
    }

    int testBlock(int[] peaks, int[] A, int numberOfBlocks, int blockLength) {
        int peaksPointer = 0;
        int[] acceptedBlocks = new int[numberOfBlocks];
        for (int actualBlock = blockLength; actualBlock <= blockLength * numberOfBlocks; actualBlock += blockLength) {

            while (peaks[peaksPointer] <= actualBlock && peaks[peaksPointer] > actualBlock - blockLength) {
                acceptedBlocks[(actualBlock / blockLength) - 1] = 1;
                if (peaksPointer < peaks.length - 1) {
                    peaksPointer++;
                } else {
                    break;
                }
            }

        }

        int result = numberOfBlocks;
        for (int i : acceptedBlocks) {
            result -= i;
        }
        if (result == 0) return 1;
        else return 0;
    }

    int findSmallestBlock(int[] peaks, int[] A) {
        int numberOfBlocks = peaks.length;
        int blockLength = 0;
        while ((numberOfBlocks >= 1)) {
            System.out.println(numberOfBlocks);
            if (A.length % numberOfBlocks != 0) {
                numberOfBlocks--;
                continue;
            }
            blockLength = A.length / numberOfBlocks;
            if (testBlock(peaks, A, numberOfBlocks, blockLength) == 1) return numberOfBlocks;
        }
        return 0;
    }

    public int solution(int[] A) {
        int[] p = getPeaks(A);
        return findSmallestBlock(p, A);
    }
}
