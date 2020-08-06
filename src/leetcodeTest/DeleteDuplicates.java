package leetcodeTest;

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


        if (head == null) {
            return head;
        }

        ListNode tempList = head;
        while (tempList != null && tempList.next != null) {
            if (tempList.val == tempList.next.val) {
                tempList.next = tempList.next.next;
            } else {
                tempList = tempList.next;
            }
        }

        return head;

    }
}
