package pl.zimi.zadanka.codillity.stacks;

public class Stack {
    char[] stack;
    int stackIndex;

    public Stack(int stackSize) {
        this.stack = new char[stackSize];
        stackIndex = 0;
    }

    void push(char c) {
        stack[stackIndex] = c;
        stackIndex++;
    }

    char pop() {
        char temp = stack[stackIndex - 1];
        stackIndex--;
        return temp;
    }
}