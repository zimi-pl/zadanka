package pl.zimi.zadanka.naukaluznezadania.streams.fromslides;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Foo {
    public void foo() {
        final char[] numbers = {'A', 'b', 'C'};
        final String result = Stream.of(numbers)
                .map(String::valueOf) // metoda statyczna
                .map(String::toLowerCase) //  metoda instancji ( s-> s.toLowerCase() )
                .map(this::appendeSeparator) //  metoda obiektu
                .map(Foo::trimmer) //  metoda obiektu
                .collect(Collectors.joining());
        System.out.println(result);
    }

    private static String trimmer(final String input) {
        return input.trim();
    }

    private String appendeSeparator(final String input) {
        return input + "-";
    }
    public static void main (String... args){
        Foo object = new Foo();
        object.foo();    }
}

