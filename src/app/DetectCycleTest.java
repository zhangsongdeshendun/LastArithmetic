package app;

public class DetectCycleTest {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                fastNode = head;
                if (fastNode != slowNode) {
                    fastNode = fastNode.next;
                    slowNode = slowNode.next;

                }
                return fastNode;
            }
        }

        return null;


    }

}
