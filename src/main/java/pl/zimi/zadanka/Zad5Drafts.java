package pl.zimi.zadanka;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zad5Drafts {
    public static int climbStairsTreeSet(int n) {
        Set<String> treeSet = new TreeSet<>();
        int sumary = 0;
        int randomPath = 0;
        String dummyPathString = "";
        int allPasscount = 0;
        int allFilteredCount = 0;
        for (Integer k = 0; k < 100000000; k++) {
            while (sumary < n) {
                randomPath = (int) ((Math.random() * (2)) + 1);

                dummyPathString += randomPath;
                sumary += randomPath;
            }
            if (sumary == n) {
                treeSet.add(dummyPathString);
//                allPasscount++;
            }

            sumary = 0;
            dummyPathString = "";
        }
//        for (String iter : treeSet) {
////            System.out.println("allFilteredcount=" + allFilteredCount + " iter=" + iter);
//            allFilteredCount++;
//        }
        allFilteredCount = treeSet.size();
        return allFilteredCount;
    }

    public static int climbStairshash(int n) {
        Set<String> treeSet = new HashSet<>();
        int sumary = 0;
        int i = 0;
        int randomPath = 0;
        String dummyPathString = "";
        int allPasscount = 0;
        int allFilteredCount = 0;
        for (Integer k = 0; k < 100000; k++) {
            while (sumary < n) {
                randomPath = (int) ((Math.random() * (2)) + 1);

                dummyPathString += randomPath;
                sumary += randomPath;
            }
            if (sumary == n) {
                treeSet.add(dummyPathString);
//                allPasscount++;
            }

            sumary = 0;
            dummyPathString = "";
        }
//        for (String iter : treeSet) {
////            System.out.println("allFilteredcount=" + allFilteredCount + " iter=" + iter);
//            allFilteredCount++;
//        }
        for (String h : treeSet) {
            System.out.println(h);
        }
        allFilteredCount = treeSet.size();
        return allFilteredCount;
    }

    public static int getRandomNumber(int min, int max) {

        return (int) ((Math.random() * (max - min)) + min);
    }
}
