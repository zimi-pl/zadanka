package pl.zimi.zadanka;

import java.util.*;
import java.util.stream.Collectors;

public class Zad20 {
    public boolean isAnagram(String s, String t) {

        return helper3(s, t);

    }

    public boolean helper(String source, String trace) {
        // Create an empty List of character
        List<Character> givenStringLetters = trace
                // Convert to String to IntStream
                .chars()
                // Convert IntStream to Stream<Character>
                .mapToObj(e -> (char) e)
                // Collect the elements as a List Of Characters
                .collect(Collectors.toList());
        String buildedWord = "";
        char letter;
        for (int i = 0; i < source.length(); i++) {
            letter = source.charAt(i);
            for (int k = 0; k < givenStringLetters.size(); k++) {

                if ((k <= givenStringLetters.size())
                        && letter == givenStringLetters.get(k)) {
                    givenStringLetters.remove(k);
                    buildedWord += letter;
                    if ((buildedWord.equals(source))
                            && (givenStringLetters.size() == 0)) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    public boolean helper2(String source, String trace) {
        if (source.length() != trace.length()) {
            return false;
        }
        List<Character> sourceStringLetters = source
                // Convert to String to IntStream
                .chars()
                // Convert IntStream to Stream<Character>
                .mapToObj(e -> (char) e)
                // Collect the elements as a List Of Characters
                .collect(Collectors.toList());
        List<Character> traceStringLetters = trace
                // Convert to String to IntStream
                .chars()
                // Convert IntStream to Stream<Character>
                .mapToObj(e -> (char) e)
                // Collect the elements as a List Of Characters
                .collect(Collectors.toList());
        String word = "";
        Iterator x = traceStringLetters.iterator();
        int k = 0;
        while (sourceStringLetters.size() > 0) {
            if (!x.hasNext()) break;
            while (x.hasNext()) {

                if (sourceStringLetters.size() > 0) {

                    if (sourceStringLetters.get(0) == x.next()) {
                        word += sourceStringLetters.get(0);
                        sourceStringLetters.remove(0);
                        x.remove();
                        if (word.equals(source)) {
                            return true;
                        }
                        x = traceStringLetters.iterator();
                        continue;
                    }
                } else return false;
                k++;
            }

        }

        return false;
    }

    public boolean helper3(String source, String trace) {
        Map<Character, Integer> distribution = new HashMap<>();
        if (source.length() != trace.length()) {
            return false;
        } else {
            for (int i = 0; i < source.length(); i++) {
                if (!distribution.containsKey(source.charAt(i))) {
                    distribution.put(source.charAt(i), 1);
                } else {
                    distribution.put(source.charAt(i), distribution.get(source.charAt(i)) + 1);
                }
                if (!distribution.containsKey(trace.charAt(i))) {
                    distribution.put(trace.charAt(i), -1);
                } else {
                    distribution.put(trace.charAt(i), distribution.get(trace.charAt(i)) - 1);
                }
            }
            List<Integer> result = new ArrayList<>(distribution.values());
            for (Integer r : result) {
                if (!r.equals(0)) {
                    return false;
                }
            }
            return true;
        }

    }
}
