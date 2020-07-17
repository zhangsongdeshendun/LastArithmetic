package swordOffer;

import java.util.Stack;
/**
 * 06 这是正确答案
 */
public class ReversePrint {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int size = stack.size();

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {

            result[i] = stack.pop();

        }

        return result;


    }


}
