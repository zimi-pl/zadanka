package pl.zimi.zadanka.naukaluznezadania.streams.statefulloperations;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StateFullOperation {

    private final Set<Integer> seen = new HashSet<>();

    private int modify(int number) {
        if (seen.contains(number)) {
            return number;
        }
        seen.add(number);
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Stream<Integer> numbers = Stream.of(1, 2, 3, 1, 2, 3, 1, 2, 3);
            StateFullOperation requriements = new StateFullOperation();
            int sum = numbers.parallel()
                    .map(requriements::modify) // tu wywoływana jest metoda, która nie jest bezstanowa
                    .mapToInt(n -> n.intValue()).sum();
            System.out.println(sum);
        }
    }
}
