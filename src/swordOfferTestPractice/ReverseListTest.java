package swordOfferTestPractice;

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
        ListNode next = null;
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
