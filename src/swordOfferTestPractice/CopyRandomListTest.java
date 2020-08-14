package swordOfferTestPractice;

import java.util.HashMap;

public class CopyRandomListTest {
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
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node current = head;
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
