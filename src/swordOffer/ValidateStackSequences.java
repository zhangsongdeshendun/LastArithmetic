package swordOffer;

import java.util.Stack;

public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);

            while (stack.size() != 0 && stack.peek() == popped[j]) {
                stack.pop();
                j++;

            }

        }

        return stack.size() == 0;

    }

}
