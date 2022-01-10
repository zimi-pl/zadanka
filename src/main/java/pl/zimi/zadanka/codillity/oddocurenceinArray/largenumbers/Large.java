package pl.zimi.zadanka.codillity.oddocurenceinArray.largenumbers;

import java.util.HashSet;
import java.util.Set;

public class Large {
    static Long zmiennaLong = 10L;

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 11; i++) {
            set.add(i);
        }
        for (int i = 0; i < 11; i++) {
            set.remove(i);
        }
        if (set.isEmpty()) System.out.println("pusty!");
        System.out.println("set = " + set);
        set.remove(1);
        System.out.println("set = " + set);

        set.remove(1);
        System.out.println("set = " + set);

        float zmiennaFloat = Float.MAX_VALUE;
        long zmiennaLongZFloat = (long) Float.MAX_VALUE;
        System.out.println("zmiennaLong = " + zmiennaLong);
        System.out.println("zmiennaFloat = " + zmiennaFloat);
        System.out.println("zmiennaLongZFloat = " + zmiennaLongZFloat);

    }
}
