package pl.zimi.zadanka.naukaluznezadania.streams.multipleKindsOfCreatingStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;


public class Creating {
    static void createArray() {
        int[] nArray = new int[10]; // 10 * 0 primitive type
        int[] xArray = {1, 2, 3, 4, 5, 6, 7, 8};
        String [][] names = {{"mr","mr"},{"mrs."},{}};
        Arrays.fill (nArray,10);
        int[] zArray = new int[]{1,2,3};
        String string = "";
        List<String> strings = List.of();
        for (String string1 : strings) {
            if (!string1.toLowerCase().isBlank()) {
                System.out.println(string1);
            }
        }
    }


    public static class Square {
        int a;
        int b;
        int surfaceArea;
        Square(int a, int b){
            this.a=a;
            this.b = b;
            this.surfaceArea =a*b;
        }
        int getSurfaceArea(){
            return this.surfaceArea;
        }
    }
    static int[] supplyArray(){

//        return new int[10];
        return new int []{1,2,3};
    }

    public static void main(String[] args) {
        // stream from collection
        Stream<Integer> sFromArrayList = new ArrayList<Integer>().stream();
        Stream<Integer> sFromLinkedList = new LinkedList<Integer>().stream();
        // stream from array (tablicy)
        Stream<Integer> sFromArray = Arrays.stream(new Integer[]{});
        createArray();
    }
}
