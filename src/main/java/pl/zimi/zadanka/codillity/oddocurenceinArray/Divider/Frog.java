package pl.zimi.zadanka.codillity.oddocurenceinArray.Divider;

public class Frog {
    //    3, 999111321, 7
    static public int solution(int X, int Y, int D) {
        return (int)Math.ceil(1.0*(Y-X)/D);
        // write your code in Java SE 8
//        int LenYX = Y - X;
//        int nSteps = 0;
//        if (LenYX == 0) return 0;
//        while (LenYX > D) {
//            LenYX = LenYX - D;
//            nSteps += 1;
//        }
//        if (LenYX != 0) nSteps += 1;
//
//
//        return nSteps;
    }

    public static void main(String[] args) {
//        System.out.println(solution (3,999111321,7));
        System.out.println(solution(1,1000000000,1));
//        System.out.println(1000000000/2);
    }
}
