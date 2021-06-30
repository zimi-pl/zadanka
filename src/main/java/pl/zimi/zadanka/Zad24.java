package pl.zimi.zadanka;

import java.util.ArrayList;
import java.util.List;

public class Zad24 {
    public boolean isValid(String s) {
        if (s.equals(null) || s.length() == 1) {
            return false;
        }
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.add(temp);
                continue;
            }
            if (!stack.isEmpty()) {
                if (temp == ')') {
                    if (stack.get(stack.size() - 1) == '(') {
                        stack.remove(stack.size() - 1);
                        continue;
                    }
                    else return false;
                }
                if (temp == ']') {
                    if (stack.get(stack.size() - 1) == '[') {
                        stack.remove(stack.size() - 1);
                        continue;
                    }
                    else return false;
                }
                if (temp == '}') {
                    if (stack.get(stack.size() - 1) == '{') {
                        stack.remove(stack.size() - 1);
                        continue;
                    }
                    else return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
