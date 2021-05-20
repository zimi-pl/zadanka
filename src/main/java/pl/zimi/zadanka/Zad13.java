package pl.zimi.zadanka;
/*
source:
https://leetcode.com/problems/fizz-buzz/
 */

import java.util.ArrayList;
import java.util.List;

public class Zad13 {
    public List<String> fizzBuzz(int n) {
        List <String> results = new ArrayList<>(function(n));
        System.out.println(results);
        return results ;
    }

    List<String> function(int n) {
        List<String> numbers = new ArrayList<>();
        String tmp;
        for (int i = 1; i <= n; i++) {
            tmp = Integer.toString(i);
            if (i % 3 == 0) {
                tmp = "Fizz";
            }
            if (i % 5 == 0) {
                tmp = "Buzz";
            }
            if ((i % 5 == 0) && (i % 3 == 0)) {
                tmp = "FizzBuzz";
            }
            numbers.add(tmp);
        }
        return numbers;
    }
}
