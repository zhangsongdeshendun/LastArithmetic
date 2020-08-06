package leetcode;

/**
 * 2. 两数相加
 * 这是正确答案
 */
public class AddTwoNumbers {
    private ListNode head;

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        while (l1 != null) {
            stringBuilder1.append(l1.val + "");
            l1 = l1.next;
        }

        while (l2 != null) {
            stringBuilder2.append(l2.val + "");
            l2 = l2.next;
        }
        stringBuilder1.reverse();
        stringBuilder2.reverse();

        String str1 = stringBuilder1.toString();
        String str2 = stringBuilder2.toString();

        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int add = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x1 = i >= 0 ? str1.charAt(i) - '0' : 0;
            int x2 = j >= 0 ? str2.charAt(j) - '0' : 0;

            result.append((x1 + x2 + add) % 10);
            add = (x1 + x2 + add) / 10;
            i--;
            j--;

        }
        makeList(result.toString());
        return head;


    }

    private void makeList(String str) {
        if (head == null) {
            head = new ListNode(str.charAt(0) - '0');
        }
        ListNode current = head;
        for (int i = 1; i < str.length(); i++) {
            ListNode temp = new ListNode(str.charAt(i) - '0');
            current.next = temp;
            current = current.next;

        }

    }
    public static void main(String[] args){


    }
}
