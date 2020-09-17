package swordOfferTestPractice;

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
        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != null) {
            currentA = currentA.next;
            length1++;
        }

        while (currentB != null) {
            currentB = currentB.next;
            length2++;
        }
        int gap = Math.abs(length1 - length2);
        if (length1 < length2) {
            for (int i = 0; i < gap; i++) {
                headB = headB.next;

            }

        } else if (length1 > length2) {
            for (int i = 0; i < gap; i++) {
                headA = headA.next;

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
