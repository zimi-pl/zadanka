package pl.zimi.zadanka.codillity.oddocurenceinArray.justArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JustArrays {
    static public int[] solution(int N, int[] A) {
        Map<Integer, Integer> elo = new HashMap<>();

        List<Integer> counters = new ArrayList<>();
//        counters.replaceAll();
//        counters.forEach(counter->counter.);
        for (int i = 0; i < A.length; i++) {
            counters.add(i, A[i]);
        }
        System.out.println(counters);
        return new int[]{0};
    }

    public static void main(String[] args) {
        solution(5, new int[]{1, 2, 3, 4, 5, 6});

    }
}
