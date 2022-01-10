package pl.zimi.zadanka.codillity.erastotenes_sieve;

import java.util.stream.IntStream;

public class PrimeNumbersExercise {
    private static int [] listPrimeNumbers(int n){
        int [] results = new int [n+1];
        results[0] = results [1] = 1;
        for(int i = 2;i*i<=n;i++) {
            if (results[i] == 0) {
                int j = i*i;
//                while (j<=n) {
                for(;j<=n;j+=i){
                    results[j] = 1;
//                    j+=i;
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {

//        IntStream.of(listPrimeNumbers(20)).filter(x-> x <1).forEachOrdered();
        int [] primes = listPrimeNumbers(20);
        IntStream.range(0,primes.length).filter(x->primes[x]<1).forEach(System.out::println);
//                forEach(System.out::println);
    }
}
