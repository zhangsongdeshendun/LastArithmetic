package swordOffer;

/**
 * 52 这是正确答案
 */
public class getIntersectionNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = getLength(headA);
        int length2 = getLength(headB);

        ListNode longNode;
        ListNode shortNode;

        if (length1 > length2) {
            longNode = headA;
            shortNode = headB;

        } else {
            longNode = headB;
            shortNode = headA;
        }
        int gap = Math.abs(length1 - length2);
        for (int i = 0; i < gap; i++) {
            longNode = longNode.next;
        }

        while (longNode!=null&&shortNode!=null&&longNode!=shortNode){
            longNode=longNode.next;
            shortNode=shortNode.next;

        }
        return longNode;

    }


    private int getLength(ListNode node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }

        return count;

    }
}
