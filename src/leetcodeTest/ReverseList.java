package leetcodeTest;

public class ReverseList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode currentHead = head;
        ListNode next;
        ListNode reverseList = null;
        while (currentHead != null) {
            next = currentHead.next;

            currentHead.next = reverseList;
            reverseList = currentHead;

            currentHead = next;
        }

        return reverseList;


    }
}
