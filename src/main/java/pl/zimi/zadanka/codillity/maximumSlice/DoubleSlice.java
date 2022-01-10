package pl.zimi.zadanka.codillity.maximumSlice;

public class DoubleSlice {
    public static int solution(int[] A) {
        if (A.length<3) return 0;


        
        return 0;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 2, 6, -1, 4, 5, -1, 2};
        System.out.print("A = " + A);
        System.out.println(solution(A));
        for(int i = 0; i < 20; i++){
            System.out.println(i+" "+(int)(Math.sqrt(i)));
        }
    }

}
