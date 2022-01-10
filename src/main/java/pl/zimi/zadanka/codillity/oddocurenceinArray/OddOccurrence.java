package pl.zimi.zadanka.codillity.oddocurenceinArray;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OddOccurrence {
    static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 11
            // List <Integer> listedA = Arrays.stream(A).boxed().collect(Collectors.toList());
            Set<Integer> set = new HashSet<>();
            for (int j : A) {

                if (set.contains(j)) {
                    set.remove(j);
                } else {
                    set.add(j);
                }
            }
            Iterator<Integer> iteratorSetu = set.iterator();

            return iteratorSetu.next();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{9, 3, 9, 3, 9, 9, 7}));
    }
}
