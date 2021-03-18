package pl.zimi.zadanka;

import java.util.Set;
import java.util.TreeSet;

/*
source:
https://leetcode.com/problems/climbing-stairs/
 */
public class Zad5 {

    public static int getRandomNumber(int min, int max) {

        ;
//        System.out.print(k);
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int climbStairs(int n) {
//        Set<Integer> treeSet = new TreeSet<>();
        Set<String> treeSet = new TreeSet<>();
        int sumary = 0;
        int i = 0;
        int randomPath = 0;
        String dummyPathString = "";
        int allPasscount = 0;
        int allFilteredCount = 0;
        for (Integer k = 0; k < 100000; k++) {
            while (sumary < n) {
                randomPath =  (int) ((Math.random() * (2)) + 1);

                dummyPathString += randomPath;
                sumary += randomPath;
            }
            if (sumary == n) {
                treeSet.add(dummyPathString);
                allPasscount++;
            }

            sumary = 0;
            dummyPathString = "";
        }
        for (String iter : treeSet) {
//            System.out.println("allFilteredcount=" + allFilteredCount + " iter=" + iter);
            allFilteredCount++;
        }
        return allFilteredCount;
    }

    public static void main(String[] args) {

        Zad5 klasa = new Zad5();
        int result = klasa.climbStairs(35);


    }


}
