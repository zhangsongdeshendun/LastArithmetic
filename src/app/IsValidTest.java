package app;

import java.util.Stack;

public class IsValidTest {

    public boolean isValid(String s) {

        if (s == null || s.length() <= 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char result = stack.pop();
                if (ch == ')') {
                    if (result != '(') {
                        return false;
                    }
                } else if (ch == '}') {
                    if (result != '{') {
                        return false;
                    }
                } else if (ch == ']') {
                    if (result != '[') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();


    }
}
