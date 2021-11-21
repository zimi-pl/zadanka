package pl.zimi.zadanka.naukaluznezadania.TestListaReferencja;

import java.util.Arrays;
import java.util.List;

public class TestListaReferencja {

    public static void main (String args[]){
        List<Object> lista = Arrays.asList(new Object());
        Object baseReference = new Object();
        Object secondReference = baseReference;
        Object referenceToY = new Object();


        System.out.println(baseReference.toString());
        System.out.println(secondReference.toString());
        System.out.println(referenceToY.toString());

    }
}
