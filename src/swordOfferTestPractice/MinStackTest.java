package swordOfferTestPractice;

import java.util.Stack;

public class MinStackTest {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStackTest() {
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
        int target = stack.pop();
        if (!minStack.isEmpty() && minStack.peek() == target) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();

    }

    public int min() {
        return minStack.peek();


    }
}
