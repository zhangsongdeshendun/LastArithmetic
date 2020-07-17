package swordOffer;

/**
 * 22 这是正确答案
 */

public class GetKthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode fastNode = head;

        for (int i = 0; i < k; i++) {
            fastNode = fastNode.next;
        }
        ListNode slowNode = head;
        while (fastNode != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        return slowNode;

    }


}
