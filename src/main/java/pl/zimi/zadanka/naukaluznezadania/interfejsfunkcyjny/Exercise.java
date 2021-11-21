package pl.zimi.zadanka.naukaluznezadania.interfejsfunkcyjny;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise {


    public static void main(String[] args) {

        Sum sum = new Sum() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
//test
        HashMap<String,Integer> hashMapa = new HashMap();
        hashMapa.put ("osobnik 1 ", 10);
        hashMapa.put ("osobnik 2 ", 11);
        hashMapa.put ("osobnik 3 ", 12);
        hashMapa.put ("osobnik 4 ", 13);
        hashMapa.put ("osobnik 5 ", 14);

        Factor factor = a->a*a;

        List<Integer> liczby = Arrays.asList(1, 2, 3, 4, 5, 6);
        liczby.forEach( System.out::println);

    }
}