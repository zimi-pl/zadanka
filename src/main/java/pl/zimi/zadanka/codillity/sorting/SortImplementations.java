package pl.zimi.zadanka.codillity.sorting;

public class SortImplementations {
    private static int[] selectionSort(int[] A) {
        int n = A.length;
        int min = 0;
        for (int k = 0; k < n; k++) {
            min = k;
            for (int j = k + 1; j < A.length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
                int temp = A[k];
                A[k] = A[min];
                A[min] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = selectionSort(new int[]{4, 3, 2, 1, 1, 2, 3, 4, 5});
        for (int j : A) {
            System.out.println("j = " + j);
        }
    }
}
