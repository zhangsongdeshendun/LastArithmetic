package leetcode;

/**
 * 这是正确答案
 */
public class RemoveNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode head1=head;
        while(head1!=null){
            head1=head1.next;
            length++;
        }
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;

        ListNode current=head;
        ListNode pre=dummyNode;

        int index=0;
        while(index<(length-n)){
            current=current.next;
            pre=pre.next;
            index++;

        }
        pre.next=current.next;
        return dummyNode.next;

    }
}
