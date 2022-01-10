package pl.zimi.zadanka.naukaluznezadania.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 5, 5};
        IntStream streamA = Arrays.stream(A);
        int minimum = streamA.min().orElse(-1);
        // int maximum = streamA.max().orElse(-1);
        // jak zrobić min i max jednosczesnie
        System.out.println(" " + minimum);
        //---------------------------------------------
        IntSummaryStatistics stats = Stream.of(2,4,3,2)
                .collect(Collectors.summarizingInt(Integer::intValue));

        int min = stats.getMin();
        int max = stats.getMax();
    }
}
