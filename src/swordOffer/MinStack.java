package swordOffer;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }

    }

    public void pop() {
        int x = stack.pop();
        if (!minStack.isEmpty() && x == minStack.peek()) {
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
