package pl.zimi.zadanka.naukaluznezadania.streams.streamVsArrays;

import java.util.*;
import java.util.stream.*;
public class Test {

    static void example (){
        // Creating an integer array
        int arr[] = { 1, 2, 3, 4, 5 };

        // --------- Using Arrays.stream() ---------

        // to convert int array into Stream
        IntStream intStream = Arrays.stream(arr);

        // Displaying elements in Stream
        intStream.forEach(str -> System.out.print(str + " "));

        // --------- Using Stream.of() ---------

        // to convert int array into Stream
        Stream<int[]> stream = Stream.of(arr);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));
    }
    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        IntStream intStream = Arrays.stream(ints);
//        intStream.forEach(System.out::println);
        intStream.forEach(number -> System.out.println(number));

        Stream<int[]> stream = Stream.of(ints);
        stream.forEach(number -> System.out.println(number));

        example();



    }
}
