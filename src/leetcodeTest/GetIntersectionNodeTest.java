package leetcodeTest;

public class GetIntersectionNodeTest {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = 0;
        int length2 = 0;
        ListNode current1 = headA;
        ListNode current2 = headB;
        while (current1 != null) {
            length1++;
            current1 = current1.next;
        }
        while (current2 != null) {
            length2++;
            current2 = current2.next;
        }
        if (length1 > length2) {
            int count = length1 - length2;
            while (count != 0) {
                headA = headA.next;
                count--;
            }

        } else if (length1 < length2) {
            int count = length2 - length1;
            while (count != 0) {
                headB = headB.next;
                count--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;


    }
}
