package leetcodeTest;

import java.util.Stack;

public class MinStackTest {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStackTest() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || getMin() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == getMin()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
