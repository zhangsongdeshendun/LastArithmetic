package leetcode;

/**
 * 这是正确答案
 */
public class ReverseList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode currentNode = head;
        ListNode next;
        ListNode reverseNode = null;

        while (currentNode != null) {
            next = currentNode.next;


            currentNode.next = reverseNode;
            reverseNode = currentNode;


            currentNode = next;
        }

        return reverseNode;


    }
}
