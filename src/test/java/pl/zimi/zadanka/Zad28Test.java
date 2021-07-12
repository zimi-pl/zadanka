package pl.zimi.zadanka;

import org.junit.jupiter.api.Test;

public class Zad28Test {
    @Test
    void dummy(){
        Zad28 solution = new Zad28();
        String[] commands = {"MinStack","push","push","push","getMin","pop","top","getMin"};
        Integer[] values = {null,-2,0,-3,null,null,null,null};
        System.out.println(solution.scan(commands,values));
    }
}
