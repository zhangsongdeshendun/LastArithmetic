package leetcode;

/**
 * 这是正确答案
 */
public class DeleteDuplicates {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode tempList = head;
        while (tempList != null) {
            ListNode p = tempList.next;
            while (p != null && p.val == tempList.val) {
                p = p.next;
            }
            tempList.next = p;
            tempList = tempList.next;
        }
        return head;


    }
}
