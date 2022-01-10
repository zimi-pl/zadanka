package pl.zimi.zadanka.codillity.leader;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.IntStream;

public class equiLEader {
        public int solution(int[] A) {
            if ( A.length==0)return -1;
            Map<Integer, Integer> leader = new HashMap<>();
            int imax=0;
            int maxCounter = 0;
            int lead=-1;
            for (int i = 0; i < A.length; i++) {
                if (leader.containsKey(A[i])) {
                    leader.put(A[i], leader.get(A[i]) + 1);
                } else {
                    leader.put(A[i], 1);
                }
                if (leader.get(A[i]) > maxCounter) {
                    maxCounter = leader.get(A[i]);
                    imax=i;
                }
            }
            if (maxCounter>A.length/2) {lead =maxCounter;}
            int equiLeaderCounter =0;
            if (A[0]==lead){
                equiLeaderCounter=0;
                for(int i = 0; i<A.length;i++){
                    if(A[i]==lead)equiLeaderCounter++;
                    if((equiLeaderCounter)>(i+1)/2){
                        // System.out.println("dominator= "+i);
                    }
                    else{
                        // System.out.println("już nie dominator= "+i);
                        return i-1;
                    }
                }
            }
            else{
                for(int i = 0; i<A.length; i++){
                    if(A[i]==lead)equiLeaderCounter++;
                    System.out.println((equiLeaderCounter>(i+1)/2) +" "+ i);
                    if (equiLeaderCounter>(i+1)/2){
                        System.out.println("Znaleziono przy i= "+i);
                        return i;
                    }
                }}
            return 0;
        }

        public int solutionStackOVERFLOW(int[] A) {
            IntStream stream = Arrays.stream(A);
            Map <Integer, Integer> map = new HashMap<>();
            int N = A.length;
            for(int i=0; i<N; i++) {
                if(map.containsKey(A[i])) {
                    map.put(A[i], map.get(A[i]) + 1);
                } else {
                    map.put(A[i], 1);
                }
            }
            int max = 0;
            int maxCount= 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(maxCount < entry.getValue()) {
                    maxCount = entry.getValue();
                    max = entry.getKey();
                }
            }

            if(maxCount <= N/2) {
                return 0;
            }

            int leaderCount = 0;
            int equiCounter = 0;
            for(int S=0; S<N-1; S++) {
                if(A[S] == max) {
                    leaderCount++;
                }
                if((leaderCount>((S+1)/2)) && ((maxCount - leaderCount) > (N - (S+1))/2)) {
                    equiCounter++;
                }
            }

            return equiCounter;


    }
}
