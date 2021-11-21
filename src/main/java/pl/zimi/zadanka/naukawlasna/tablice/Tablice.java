package pl.zimi.zadanka.naukawlasna.tablice;

import java.util.Arrays;
import java.util.Collections;

public class Tablice {

    /**
     * Example of sort order limitation only in one direction
     * To use compareTo it's needed to opaque char data in Character type
     * creating new Array/object
     */
    public void reverseOrder() {
        char[] tab = {'b', 'd', 'a', 'c'};
        Arrays.sort(tab);
        System.out.println(tab);
//        Character[ ] Tab2 =
//        Arrays.sort(tab, Collections.reverseOrder());
    }
}
