package pl.zimi.zadanka;

class MinStack {
    int[] stack;
    int numberEl;

    public MinStack() {
        stack = new int[10];
        numberEl = -1;
    }

    public void push(int val) {
        if ((numberEl + 1) % 10 == 0 && numberEl+1!=0) {
            int[] temp = new int[2 * (numberEl + 1)];
            for (int i = 0; i <= numberEl; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        stack[++numberEl] = val;
    }

    public void pop() {
        numberEl--;
    }

    public int top() {
        return stack[numberEl];
    }

    public int getMin() {
        Integer minVal = stack[0];
        for (int i =0;i<= numberEl;i++) {
            if( minVal>stack[i] ){
                  minVal = stack[i];
            }
        }

        return minVal;
    }
}
