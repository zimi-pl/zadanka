package pl.zimi.zadanka;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
source:
https://leetcode.com/problems/climbing-stairs/
 */
public class Zad5 {
//    public void Node ( int destination,int currentPath){
//        int left = currentPath+1;
//        int right = destination+2;
//    }
    /*
    key = destination pointer=current node
    left/right child node
     */
    public static int climbStairs(int key) {
        int solutionCounter = 0;
        int startPointer=1;
        int pointer =startPointer;
        int left=1;
        int right=2;

        while ((pointer!=0)&&(pointer!=key)){


        }



        return solutionCounter;
    }


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
        for(String h : treeSet){
            System.out.println(h);
        }
        allFilteredCount = treeSet.size();
        return allFilteredCount;
    }

    public static int getRandomNumber(int min, int max) {

        ;
//        System.out.print(k);
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {

        Zad5 klasa = new Zad5();
        System.out.println(klasa.climbStairshash(5)) ;
//        System.out.println(klasa.climbStairs(3));


    }


}
