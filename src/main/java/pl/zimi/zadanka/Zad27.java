package pl.zimi.zadanka;
//https://leetcode.com/problems/counting-bits/submissions/
public class Zad27 {
    int brianMethod(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    int[] binaryAddingmethod(int n) {
        int offset = 1;
        int[] result = new int[n + 1];
        for (int index = 1; index < n + 1; index++) {
            if (2 * offset == index) {
                offset *= 2;
            }
            result[index] = result[index - offset] + 1;
        }
        return result;
    }
}
