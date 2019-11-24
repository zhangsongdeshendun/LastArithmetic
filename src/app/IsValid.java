package app;

import java.util.Stack;

public class IsValid {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if (s.charAt(i) == ')') {
                    if (ch != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (ch != '{') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (ch != '[') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();

    }
}
