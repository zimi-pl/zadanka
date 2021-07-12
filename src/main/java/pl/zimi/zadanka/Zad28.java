package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.List;

public class Zad28 {
    List<String> scan(String[] commands, Integer[] values) {
        MinStack minstack = null;
        List<String> responseList = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            String response = "";
            if (commands[i].equals("MinStack")) {
                minstack = new MinStack();
            }
            if (minstack != null) {
                if (commands[i].equals("push")) {
                    minstack.push(values[i]);

                }
                if (commands[i].equals("pop")) {
                    minstack.pop();

                }
                if (commands[i].equals("top")) {
                    response = String.valueOf(minstack.top());
                }
                if (commands[i].equals("getMin")) {
                    minstack.getMin();
                    response = String.valueOf(minstack.getMin());
                }

            }
            responseList.add(response);
        }
        return responseList;
    }
}
