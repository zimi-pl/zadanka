package pl.zimi.zadanka;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
source:
https://leetcode.com/problems/climbing-stairs/
 */
public class Zad5 {

    public static int getRandomNumber(int min, int max) {

        ;
//        System.out.print(k);
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int climbStairs(int n) {
//        Set<Integer> treeSet = new TreeSet<>();
        Set<String> treeSet = new TreeSet<>();
        int sumary = 0;
        int i = 0;
        int randomPath = 0;
        String dummyPathString = "";
        int allPasscount = 0;
        int allFilteredCount = 0;
        for (Integer k = 0; k < 100000; k++) {
            while (sumary < n) {
                randomPath =  (int) ((Math.random() * (2)) + 1);

                dummyPathString += randomPath;
                sumary += randomPath;
            }
            if (sumary == n) {
                treeSet.add(dummyPathString);
                allPasscount++;
            }

            sumary = 0;
            dummyPathString = "";
        }
        for (String iter : treeSet) {
//            System.out.println("allFilteredcount=" + allFilteredCount + " iter=" + iter);
            allFilteredCount++;
        }
        return allFilteredCount;
    }

    public static void main(String[] args) {

        Zad5 klasa = new Zad5();
        int result = klasa.climbStairs(35);
        System.out.println("abc".contains("b"));
        System.out.println("as".equals(""));


        Zad5 zad5 = new Zad5();
        Function<String, Integer> function = zad5::mojeContains;
        Function<String, Integer> x = s -> s.length();
        Predicate<String> x = y -> ;

//        7, 4  ->   11
//                4, 7  -> 11

        Comparator<Integer> comparator = (z, y) -> y - z;
        class X {
            String x;
        }

        List<String> list = new ArrayList<>(Arrays.asList("abc", "tewwet", "wef", "asdfa"));
        Map<Integer, List<String>> collect = list.stream()
                .map()
                .filter()
                .max()

                .collect(Collectors.groupingBy(String::length));

        System.out.println(collect);

        System.out.println(Arrays.asList(5,4,2,6,2,1, 2,3, 4,5,6,7,8,9).stream().sorted((a, b) -> b- a).collect(Collectors.toList()));

        Function<String, Integer> length1 = x -> x.length();
        Function<Zad5, Integer> length2 = Zad5::mojeContains;
        Function<Zad5, Integer> length3 = x -> x.mojeContains();
        Function<Zad5, Integer> length4 = (Zad5 x) -> x.mojeContains2(asdf);
        Zad5 zad51 = new Zad5();
        Function<String, Integer> length5 = zad51::mojeContains2;
        Function<String, Integer> length6 = x -> zad51.mojeContains2(x);

        baza.query("SEECT * FROM")

        Optional<Integer> max = list.stream()
                .map(length1)
                .filter(x -> x < 6)
                .max(comparator);

//        Optional.empty(); -> null
        Optional<String> optString = Optional.empty();
        System.out.println(optString.map(String::length));

        String costam = null;
        costam.length();
//        x.getCos().getX().getY()
        Optional.of(new Date()).filter(Date::getTime).map(Long::toString).map(String::isEmpty)


        System.out.println(max);
//        list.removeIf(function);

//        System.out.println(function.apply("wejscie"));
    }

    int mojeContains() {
        return o.length();
    }


    int mojeContains2(String y) {
        return o.length();
    }

}
