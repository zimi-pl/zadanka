package pl.zimi.zadanka.naukawlasna.jijoi;

import java.util.*;
import java.util.stream.Collectors;

public class tese {
    public static void main(String[] args) {
//        Set <Integer> elo = new TreeSet<>();
//        Iterator<Integer> iterator = elo.iterator();
//        Integer buffer= iterator.next();
        List<Integer> aa = new ArrayList<>();
        Map<Integer, Integer> a = new HashMap<>();
        a.entrySet()
                .stream()
                .filter(el->el.getValue()<2)
                .distinct();
        a.get(1);
        Map<Integer,Integer> sumOfOcursion = new HashMap<>();
        Map<Integer, Integer>  result = sumOfOcursion.entrySet()
                .stream()
                .filter(el->el.getValue()<2)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));


        Integer liczba = 5;
        String string = Integer.toString(5, 2);
        String string2 = Integer.toString(1041, 2);
        System.out.println("string = " + string);
        System.out.println("string2 = " + string2);
        System.out.println(string2.charAt(1));
        int localLen =0;
        int MaxLen =0;
        for (int i = 0; i < string2.length(); i++) {

            char c = string2.charAt(i);
            if (c== '0'){
                localLen+=1;
            }
            else{
                localLen=0;
            }
            MaxLen =  localLen>MaxLen ? localLen :MaxLen;
        }
        System.out.println("MaxLen = " + MaxLen);
//        int[] a = new int[]{};
//        System.out.println(a.length);
    }

}
