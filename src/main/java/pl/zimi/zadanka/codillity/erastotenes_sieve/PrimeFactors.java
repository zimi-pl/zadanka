package pl.zimi.zadanka.codillity.erastotenes_sieve;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int d = 2;
        while (n > 1) {
            while (n % d == 0) {
                factors.add(d);
                n /= d;
            }
            d += 1;
            if (d * d > n) {
                if (n > 1) {
                    factors.add(n);
                }
                break;
            }
        }
        return factors;
    }

    public static void main(String[] arg) {
        List<Integer> primeFactors = getPrimeFactors(20);
        System.out.println("primeFactors = " + primeFactors);
    }
}
