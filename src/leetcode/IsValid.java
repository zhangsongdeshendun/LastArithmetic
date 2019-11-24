package leetcode;

import java.util.Stack;
/**
 * 这是正确答案
 *
 * 20. 有效的括号
 */
public class IsValid {


    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    switch (s.charAt(i)) {
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                            }
                            break;
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                            }
                            break;
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                            }
                            break;
                        default:

                            break;
                    }
                }

            }

        }

        return stack.isEmpty();


    }


    public static void main(String[] args) {

    }
}
