package leetcodeTest;

public class DeleteDuplicatesIITest {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummpNode = new ListNode(-1);
        ListNode p = dummpNode;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head != null && head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                head = head.next;

            } else {
                p.next = head;
                p = p.next;
                head = head.next;
            }
        }
        p.next = head;
        return dummpNode.next;

    }

}
