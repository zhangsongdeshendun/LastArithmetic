package swordOfferTestPractice;

import java.util.Stack;

public class GetKthFromEndTest {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        for (int i = 1; i < k; i++) {

            stack.pop();
        }
        return stack.pop();

    }
}
