package swordOffer;

/**
 * 18题 这是正确答案
 */
public class DeleteNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode holderNode = new ListNode(-1);//构造一个holderNode，指向head，这么做的好处是 如果head要删除，也好处理
        holderNode.next = head;
        ListNode index = holderNode;

        while (index.next != null) {

            if (index.next.val == val) {
                index.next = index.next.next;
                break;

            }
            index = index.next;
        }

        return holderNode.next;


    }
}
