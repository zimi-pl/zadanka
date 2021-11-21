package pl.zimi.zadanka.naukaluznezadania.streams.streamVsCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsColeection {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Ann", "George");
        list.stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        // zrobić to samo dla poprzez  interfejs stream który obsługuje vargs.
        Stream<String> peoples = Stream.of("Alice", "Bob", "Ann", "George");
        peoples
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
