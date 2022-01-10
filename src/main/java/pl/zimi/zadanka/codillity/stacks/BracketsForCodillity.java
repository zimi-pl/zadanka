package pl.zimi.zadanka.codillity.stacks;

import java.util.Stack;

public class BracketsForCodillity {


    public int solution(String S) {
        char c;
        Stack<Character> stos = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stos.push(c);
            }
            if (c == ')') {
                if (stos.isEmpty() || (stos.peek() != '(')) {
                    return 0;
                }
            }
            if (c == ']') {
                if (stos.isEmpty() || (stos.peek() != '[')) {
                    return 0;
                }
            }
            if (c == '}') {
                if (stos.isEmpty() || (stos.peek() != '{')) {
                    return 0;
                }
            }
            if (c == ')' || c == '}' || c == ']') {
                stos.pop();
            }
        }
        if (stos.isEmpty()) return 1;
        else {
            return 0;
        }
    }

}
