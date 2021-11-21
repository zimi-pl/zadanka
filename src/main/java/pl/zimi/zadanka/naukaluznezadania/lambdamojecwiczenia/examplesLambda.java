package pl.zimi.zadanka.naukaluznezadania.lambdamojecwiczenia;

import pl.zimi.zadanka.naukaluznezadania.mojalambda.Checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class examplesLambda {
    Checker<Integer> isOddAnonymous = new Checker<Integer>() {
        @Override
        public boolean check(Integer object) {
            return object % 2 != 0;
        }
    };

    private static void sampleUsage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);
        numbers.forEach(n-> System.out.println(n));
        numbers.forEach(System.out::println);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        for(Integer tekst : numbers){

        }

    }
    public static void main(String[] args){
        sampleUsage();
        List <String> lista = new ArrayList<>();
        lista.add("aala");
        lista.add("aala22");
        for (String s: lista){
            System.out.println(s);
        }

    }

}
