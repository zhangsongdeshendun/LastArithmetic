package leetcode;

/**
 * 这是正确答案
 * 82. 删除排序链表中的重复元素 II
 */
public class DeleteDuplicatesII {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
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
        return dummyHead.next;


    }
}
