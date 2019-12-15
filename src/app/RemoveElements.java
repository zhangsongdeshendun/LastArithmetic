package app;

/**
 * 203. 移除链表元素
 */
public class RemoveElements {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode zeroHead = new ListNode(0);
        zeroHead.next = head;
        ListNode currentNode = head;
        ListNode preNode = zeroHead;

        while (currentNode != null) {
            if (currentNode.val == val) {
                preNode.next = currentNode.next;
                currentNode = currentNode.next;
            } else {
                preNode = preNode.next;
                currentNode = currentNode.next;
            }
        }

        return zeroHead.next;


    }


}
