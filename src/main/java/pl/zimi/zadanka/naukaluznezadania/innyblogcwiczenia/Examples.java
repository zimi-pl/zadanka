package pl.zimi.zadanka.naukaluznezadania.innyblogcwiczenia;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Examples {
    public static void showCountExample() {
        List<String> lista = Arrays.asList("Adin", "DWA", "TRI");
        Long listCount = lista.stream()
                .map(element -> element.toLowerCase())
                .count();
        System.out.println("listCount = " + listCount);
    }

    public static void showCountExample2() {
        List<String> lista = Arrays.asList("Adin", "DWA", "TRI");
        Long listCount = lista.stream()
                .map(element -> element.toLowerCase()).peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
                .filter(element -> element.length() > 3)

                .count();
        System.out.println("listCount = " + listCount);
    }

    public static void showFlatMap() {
        List<String> lista = Arrays.asList("A na drzewie", "Zamiast liści", "będą wisieć komuniści");

        lista.stream()
                .flatMap(wers -> {
                            String[] split = wers.split(" ");
                            return (Stream<String>) Arrays.asList(split).stream();
                        }
                )
                .forEach(System.out::print);

    }

    public static void trimingLiczbBiznes() {
        final String[] balances = {"0.01", "19.99", "100 "};

        Arrays.stream(balances)
                .map(String::trim) // .map( current -> current.trim() )
                .map(balance -> balance.replace(",", "."))
                .map(BigDecimal::new) // .map( current -> new BigDecimal(current) )
                .forEach(System.out::println);
    }

    public static void turnToArray() {
        Stream<String> stream = Arrays.asList("To jest", "Lista stringow", "hehehe").stream();
        String[] result = stream.toArray(String[]::new);
        for (String s : result) {
            System.out.println("s = " + s);
        }
    }

    public static void collectTest() {
        Stream<String> stream = Arrays.asList("to jest ", "lista", "stringów").stream();
        List<String> list = stream.collect(Collectors.toList());
        System.out.println("list = " + list);
    }

    public static void reduceTest() {
        Integer K1 = 0;
        if (K1.intValue() < 0) System.out.println("");
        Stream<Integer> liczby = Arrays.asList(3, 1, 2, 4, 6).stream();
        Optional<Integer> result = liczby.reduce((l1, l2) -> {
            return l2;
        });

        System.out.println("result = " + result);


    }

    public static void main(String[] args) {

        showCountExample();
        showCountExample2();
        showFlatMap();

        turnToArray();
        collectTest();
        reduceTest();
        trimingLiczbBiznes();
        System.out.println();
    }
}
