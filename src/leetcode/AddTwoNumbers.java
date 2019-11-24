package leetcode;


import java.util.Stack;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 *
 * 您将获得两个代表两个非负数的链表。 数字以相反的顺序存储，每个节点包含一个数字。 添加两个数字并将其作为链接列表返回。
 *
 * 输入：（2  - > 4  - > 3）+（5  - > 6  - > 4）
 * 输出：7  - > 0  - > 8
 */
public class AddTwoNumbers {

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


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack = new Stack<>();
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        ListNode resultNode = null;
        String currentStr1 = "";
        String currentStr2 = "";

        while (currentNode1 != null) {
            stack.push(currentNode1.val);
            currentNode1 = currentNode1.next;
        }

        while (!stack.empty()) {
            currentStr1 += stack.pop();

        }

        stack.clear();
        while (currentNode2 != null) {
            stack.push(currentNode2.val);
            currentNode2 = currentNode2.next;
        }

        while (!stack.empty()) {
            currentStr2 += stack.pop();

        }
        long target = Long.valueOf(currentStr1) + Long.valueOf(currentStr2);
        char[] targetStr = String.valueOf(target).toCharArray();
        stack.clear();
        for (int i = 0; i < targetStr.length; i++) {
            stack.add(Integer.valueOf(targetStr[i]+""));
        }


        while (!stack.empty()) {
            ListNode node = new ListNode(stack.pop());
            if (resultNode == null) {
                resultNode = node;
                continue;
            }
            ListNode currentNode = resultNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;

        }

        return resultNode;


    }

    public static void main(String[] args) {

        AddTwoNumbers linkList = new AddTwoNumbers();
        int[] arr = {1,9,9,9,9,9,9,9,9,9};
        int[] arr1 = {9};

        for (int i = 0; i < arr.length; i++) {
            linkList.add(arr[i]);

        }

        for (int i = 0; i < arr1.length; i++) {
            linkList.add1(arr1[i]);

        }

        linkList.printNode(linkList.addTwoNumbers(linkList.head, linkList.head1));
    }

}
