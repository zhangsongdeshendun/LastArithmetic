package leetcode;

/**
 * 这是正确答案
 *
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode head;
    private ListNode head1;

    public void add(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return;
        }

        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    public void add1(int data) {
        ListNode node = new ListNode(data);
        if (head1 == null) {
            head1 = node;
            return;
        }

        ListNode currentNode = head1;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    /**
     * 打印链表
     */
    public void printNode(ListNode node) {
        if (node == null) {
            return;
        }

        ListNode currentNode = node;

        while (currentNode != null) {
            System.out.println(currentNode.val + "");
            currentNode = currentNode.next;
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
        ListNode mergeHead;
        ListNode currentHead;

        if (l1.val < l2.val) {
            currentHead = l1;
            mergeHead = currentHead;
            l1 = l1.next;
        } else {
            currentHead = l2;
            mergeHead = currentHead;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                currentHead.next = l1;
                currentHead = currentHead.next;
                l1 = l1.next;

            } else {
                currentHead.next = l2;
                currentHead = currentHead.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            currentHead.next = l2;
        }

        if (l2 == null) {
            currentHead.next = l1;
        }

        return mergeHead;


    }

    public static void main(String[] args) {
        MergeTwoLists linkList = new MergeTwoLists();
        int[] arr = {1, 2, 4};
        int[] arr1 = {1, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            linkList.add(arr[i]);

        }

        for (int i = 0; i < arr1.length; i++) {
            linkList.add1(arr1[i]);

        }

        linkList.printNode(linkList.mergeTwoLists(linkList.head, linkList.head1));

    }
}
