package swordOffer;

import java.util.Stack;
/**
 * 9题 这是正确答案
 */
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void appendTail(int value) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(value);

    }

    public int deleteHead() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1;

    }


}
