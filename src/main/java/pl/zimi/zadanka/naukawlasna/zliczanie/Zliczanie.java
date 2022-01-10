package pl.zimi.zadanka.naukawlasna.zliczanie;

import java.util.Arrays;
import java.util.List;

public class Zliczanie {

    static List<Integer> lista = Arrays.asList(1,2,3,4,2,1);
    public static void main(String[] arg){
        Long count =lista
                .stream()
                .count();
        System.out.println("count = " + count);
//        ListUtils.show

    }

}
