package pl.zimi.zadanka.naukaluznezadania.examplescanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pattern {
    public static List<Integer> receiveInputData() {
        List<Integer> patternList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Integer s1 = sc.nextInt();
            System.out.println(s1);
            patternList.add(s1);
        }
        return patternList;
    }
    public static void printPattern(int n) {
        for (int j = -n + 1; j < n; j++) {
            for (int k = -n + 1; k < n; k++) {
                System.out.print(n - Math.max(Math.abs(j), Math.abs(k)) + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        List <Integer> patternList = receiveInputData();
        printPattern(5);
    }
}
