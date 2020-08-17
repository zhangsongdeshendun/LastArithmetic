package leetcode;

/**
 * 234. 回文链表
 *
 * 这是正确答案
 */
public class IsPalindromeLink {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null||head.next==null) {
            return true;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        ListNode currentNode = slowNode;
        ListNode reverseNode = null;
        ListNode next;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = reverseNode;
            reverseNode = currentNode;

            currentNode = next;

        }

        while (reverseNode != null && head != null) {
            if (reverseNode.val != head.val) {
                return false;
            }
            reverseNode = reverseNode.next;
            head = head.next;
        }
        return true;

    }
}
