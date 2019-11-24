package leetcode;

/**
 * 这是正确答案
 */
public class RemoveNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        int i;
        for (i = 0; i < n; i++) {
            p = p.next;
            if (p == null) {
                break;
            }
        }

        if (i == n - 1 && p == null) {
            return head.next;
        }

        if (i < n - 1 && p == null) {
            return head;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return q;

    }
}
