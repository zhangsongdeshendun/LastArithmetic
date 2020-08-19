package leetcodeTest;


public class IsPalindromeLinkTest {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        ListNode reverseNode = null;
        ListNode next;
        while (slowNode != null) {
            next = slowNode.next;
            slowNode.next = reverseNode;
            reverseNode = slowNode;

            slowNode = next;
        }

        while (head != null && reverseNode != null) {
            if (head.val != reverseNode.val) {
                return false;
            }
            head = head.next;
            reverseNode = reverseNode.next;
        }
        return true;

    }
}
