package pl.zimi.zadanka;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/reverse-integer/
public class Zad32Test {
    @Test
    void dummyTest() {
        Zad32 solution = new Zad32();
        solution.reverse(123);
    }

    @Test
    void maxValuetest() {
        Zad32 solution = new Zad32();
        int result = solution.reverse(Integer.MAX_VALUE - 100000000);
        System.out.println("result = " + result);
        result = solution.reverse(Integer.MIN_VALUE);
        System.out.println("result = " + result);
//        -2147483648
//        2147483641
        result = solution.reverse(2147483641);
        System.out.println("result = " + result);
        result = solution.reverse(2147483639);
        System.out.println("result = " + result);
    }

    @Test
    void test1234567890() {
        Zad32 solution = new Zad32();
        int result = solution.reverse(1234567809);
        System.out.println(result + " result");
    }

    @Test
    void testiterated() {
        List<Integer[]> outputData = new ArrayList<>();
        int start = 999999670;
        int calc = 0;
        Zad32 solution = new Zad32();
        int i=0;
        do {
            start += 1;
            calc = solution.reverse(solution.reverse(start));
            outputData.add(i++, new Integer[]{start, calc});
//            System.out.println(start);
        } while (calc == start);
        outputfile(outputData);
        System.out.println(start);
    }
    @Test
    void testiterated2() {
        List<Integer[]> outputData = new ArrayList<>();
        int start = Integer.MAX_VALUE;
        int calc = 0;
        Zad32 solution = new Zad32();
        int i=100000;
        do {
            start -=1;
            calc = solution.reverse(solution.reverse(start));

                outputData.add(100000-i, new Integer[]{start, calc});
//            System.out.println(calc);
            i--;
        } while (start != calc);
        outputfile(outputData);
//        System.out.println(start);
    }



    void outputfile(List<Integer[]> list) {
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("number,");
            sb.append('\t');
            sb.append("revert");
            sb.append('\n');

            for (Integer[] k : list) {
                sb.append(k[0] + "\t" + k[1]);
                sb.append('\n');
            }


            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
