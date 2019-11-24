package app;

public class ReverseListTest {

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
        ListNode currentNode = head;
        ListNode next;
        ListNode reverseHead = null;
        while (currentNode != null) {
            next = currentNode.next;

            currentNode.next = reverseHead;
            reverseHead = currentNode;

            currentNode = next;
        }

        return reverseHead;


    }
}
