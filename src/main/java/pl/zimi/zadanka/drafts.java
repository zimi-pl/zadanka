package pl.zimi.zadanka;

public class drafts {
    public static int sumaRekurencja(int n) {
        if (n > 0) {

            int y = n + sumaRekurencja(n - 1);
            System.out.println(y);
            return y;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
    }
}
