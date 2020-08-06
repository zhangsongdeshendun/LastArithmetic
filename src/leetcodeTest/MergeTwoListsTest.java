package leetcodeTest;

public class MergeTwoListsTest {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode currentNode = null;
        ListNode mergeNode = null;

        if (l1.val < l2.val) {
            currentNode = l1;
            mergeNode = currentNode;
            l1 = l1.next;

        } else {
            currentNode = l2;
            mergeNode = currentNode;
            l2 = l2.next;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentNode.next = l1;
                currentNode = currentNode.next;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                currentNode = currentNode.next;
                l2 = l2.next;
            }

        }
        if (l1 == null) {
            currentNode.next = l2;
        }

        if (l2 == null) {
            currentNode.next = l1;
        }

        return mergeNode;


    }
}
