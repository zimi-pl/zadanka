package pl.zimi.zadanka.codillity.oddocurenceinArray.justArrays;

public class MissingNumber {
    public int solutionx(int[] A) {
        boolean[] b = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= A.length && A[i] > 0) {
                b[A[i] - 1] = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) return i + 1;
        }
        return 1;
    }

    public int countDiv(int[] A) {
        boolean[] occurrence = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= A.length && A[i] > 0) occurrence[A[i] - 1] = true;
        }
        for (int x = 1; x < occurrence.length; x++) {
            System.out.print(x + "=" + occurrence[x] + " ");
            if (!occurrence[x]) return x + 1;
        }
        return 1;
    }

    public int passingCars(int[] A) {

        // write your code in Java SE 8
        int westCars = 0;
        int resultx = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                westCars++;
            } else {
                resultx += westCars;
                if (resultx > 1000000000) return -1;
            }
        }

        return resultx;
    }


    public int countDiv(int A, int B, int K) {
        int diff = 0;
        if (K >= B) return 1;
        if (K > A) {
            diff = B - K;
            return (diff + 1) / K + 1;
        } else {
            diff = B - A;
            return (diff + 1) / K;
        }
    }

//    int solution(int A, int B, int K) {
//        return B / K - A / K + !(A % K);
//    }



//import java.util .*;

    class Solution {
        public int convert(char c) {
            int result = 0;
            switch (c) {
                case 'A':
                    result = 1;
                    break;
                case 'C':
                    result = 2;
                    break;
                case 'G':
                    result = 3;
                    break;
                case 'T':
                    result = 4;
                    break;
            }
            return result;
        }

        public int[] solutionx(String S, int[] P, int[] Q) {
            char[] charS = S.toCharArray();
            int[] minimum = new int[P.length];
            int tempMinimum = 5;
            // for (char c: charS){
            //     System.out.print(convert(c));
            // }
            // System.out.println();
            for (int i = 0; i < P.length; i++) {
                tempMinimum = 5;
                for (int j = P[i]; j <= Q[i]; j++) {
                    int val = convert(charS[j]);
                    // System.out.println("val="+val+" "+"j="+j+" "+"i="+i);
                    if (val == 1) {
                        tempMinimum = 1;
                        break;
                    }
                    if (tempMinimum > val) {
                        tempMinimum = val;
                    }
                }
                minimum[i] = tempMinimum;
            }
            return minimum;
        }

        public int[] solution(String S, int[] P, int[] Q) {
            char[] charS = S.toCharArray();
            int[] intS = new int[charS.length];
            for (int c = 0; c < charS.length; c++) {
                intS[c] = convert(charS[c]);
            }
            int[] minimum = new int[P.length];
            int tempMinimum = 5;
            // for (char c: charS){
            //     System.out.print(convert(c));
            // }
            // System.out.println();
            for (int i = 0; i < P.length; i++) {
                tempMinimum = 5;
                for (int j = P[i]; j <= Q[i]; j++) {
                    int val = intS[j];
                    // System.out.println("val="+val+" "+"j="+j+" "+"i="+i);
                    if (val == 1) {
                        tempMinimum = 1;
                        break;
                    }
                    if (tempMinimum > val) {
                        tempMinimum = val;
                    }
                }
                minimum[i] = tempMinimum;
            }
            return minimum;
        }

        public int[] solutionxccx(String S, int[] P, int[] Q) {
            // write your code in Java SE 8
            System.out.println("bylo A");
            char[] charS = new char[S.length()];
            int[] results = new int[P.length];
            int[][] counters = new int[S.length()][2];
            for (int i = 0; i < S.length(); i++) {

            }
            for (int i = 0; i < P.length; i++) {

            }
            return results;
        }
        // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


        public int[] GenomicRangeQuery(String S, int[] P, int[] Q) {

            char[] charS = new char[S.length()];
            int[] results = new int[P.length];
            int[][] counters = new int[S.length()][3];

            if (S.charAt(0) == 'A') {
                counters[0][0] = 1;
            }
            if (S.charAt(0) == 'C') {
                counters[0][1] = 1;
            }
            if (S.charAt(0) == 'G') {
                counters[0][2] = 1;
            }

            for (int i = 1; i < S.length(); i++) {

                // if(S.charAt(i) =='A')counters[i][0]=counters[i-1][0]+1;
                counters[i][0] = S.charAt(i) == 'A' ? counters[i - 1][0] + 1 : counters[i - 1][0];
                counters[i][1] = S.charAt(i) == 'C' ? counters[i - 1][1] + 1 : counters[i - 1][1];
                counters[i][2] = S.charAt(i) == 'G' ? counters[i - 1][2] + 1 : counters[i - 1][2];
            }
            // for(int i = 0; i < S.length(); i++){
            //     System.out.print(" i="+i);
            //     System.out.print(" A="+counters[i][0]);
            //     System.out.print(" C="+counters[i][1]);
            //     System.out.print(" G="+counters[i][2]);
            //     System.out.println();
            // }
            for (int i = 0; i < P.length; i++) {

                // System.out.println(counters[Qi]][0]+" "+counters[Q[i]][0]);
                // System.out.println(counters[Q[i]][0]+" "+counters[Q[i]][0]);
                // System.out.println(counters[Q[i]][1]+" "+counters[Q[i]][1]);
                // System.out.println(counters[Q[i]][2]+" "+counters[Q[i]][2]);
                // System.out.println();
                if (counters[Q[i]][0] - counters[P[i]][0] > 0) {

                    results[i] = 1;
                } else {
                    if (counters[Q[i]][1] - counters[P[i]][1] > 0) {

                        results[i] = 2;
                    } else {
                        if (counters[Q[i]][2] - counters[P[i]][2] > 0) {
                            results[i] = 3;
                        } else {
                            if (P[i] == Q[i]) {
                                if (S.charAt(P[i]) == 'A') results[i] = 1;
                                if (S.charAt(P[i]) == 'C') results[i] = 2;
                                if (S.charAt(P[i]) == 'G') results[i] = 3;
                                if (S.charAt(P[i]) == 'T') results[i] = 4;
                            } else {
                                results[i] = 4;
                            }

                        }
                    }
                }
            }
            return results;
        }


    }

}
