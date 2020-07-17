package swordOfferTestPractice;

public class DeleteNodeTest {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode holderNode = new ListNode(-1);
        holderNode.next = head;
        ListNode firstNode = holderNode;
        while (firstNode.next != null) {

            if (firstNode.next.val == val) {
                firstNode.next = firstNode.next.next;
                break;
            }
            firstNode = firstNode.next;
        }

        return holderNode.next;


    }
}
