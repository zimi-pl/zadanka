package pl.zimi.zadanka.naukaluznezadania.lambdamojecwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambFuncInterface {
    public static void main(String Args[]) {

        FuncInterface instanceFuncInterface = (int x) -> System.out.println(x);
        instanceFuncInterface.abstractFun(5);
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5,6);
        integerList.forEach(x -> {
            if (x % 2 != 0) System.out.println(x + 1);
        });


    }
}
