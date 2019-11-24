package leetcode;
/**
 * 这是正确答案
 *
 * 141. 环形链表
 */
public class HasCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            while (fastNode == slowNode) {//相遇的点不一定在开始点
                return true;
            }


        }
        return false;


    }
}
