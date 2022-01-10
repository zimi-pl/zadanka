package pl.zimi.zadanka.codillity.distinct;
import java.util.BitSet;
public class Distinction {




        public static int solution(int[] A) {
            int offset = 1_000_000;
            // first part for negatives, second part for positives and adding
            // counting zero as part of the positives section
            BitSet bitSet = new BitSet( (offset * 2) + 1 );

            for (int element : A ) {
                int index = element >= 0 ? offset + element : (element * -1);
                bitSet.set(index);
            }

            return bitSet.cardinality();

    }

    public static void main(String[] args) {
            int[] A = new int[2*1000000+1];
        for(int i =0; i<= 2000000; i++){
            A[i]=-1000000+i;
        }
        System.out.println(solution(A));
    }
}
