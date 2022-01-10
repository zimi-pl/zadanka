package pl.zimi.zadanka.codillity.leader;

import java.util.HashMap;
import java.util.Map;

public class Leader {
    static public int solution(int[] A) {
        if (A.length == 0) return -1;
        Map<Integer, Integer> leader = new HashMap<>();
        int imax = 0;
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (leader.containsKey(A[i])) {
                leader.put(A[i], leader.get(A[i]) + 1);
            } else {
                leader.put(A[i], 1);
            }
            if (leader.get(A[i]) > maxCounter) {
                maxCounter = leader.get(A[i]);
                imax = i;
            }
        }
        if (maxCounter > A.length / 2) return imax;
        else return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1};
        System.out.println("a = " + a + " = " + solution(a));
        a = new int[]{1,1};
        System.out.println("a = " + a + " = " + solution(a));
        a = new int[]{};
        System.out.println("a = " + a + " = " + solution(a));
        a = new int[]{1,1,2,2,2};
        System.out.println("a = " + a + " = " + solution(a));
        a = new int[]{1,2};
        System.out.println("a = " + a + " = " + solution(a));
        System.out.println(1/2);
    }
}
