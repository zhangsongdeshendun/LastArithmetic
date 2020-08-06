package swordOffer;

import java.util.HashMap;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * 这是正确答案
 */
public class CopyRandomList {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {

        Node current = head;
        HashMap<Node, Node> hashMap = new HashMap<>();
        while (current != null) {
            hashMap.put(current, new Node(current.val));
            current = current.next;

        }
        current = head;
        while (current != null) {
            hashMap.get(current).next = hashMap.get(current.next);
            hashMap.get(current).random = hashMap.get(current.random);
            current = current.next;
        }
        return hashMap.get(head);

    }
}
