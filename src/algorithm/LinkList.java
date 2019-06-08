package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 链表的相关操作都在这里
 */
public class LinkList {

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

        public void display() {
            System.out.println(data + "");
        }
    }

    Node head = null;

    /**
     * 向链表中添加数据
     */
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    /**
     * 打印链表
     */
    public void printNode(Node node) {
        if (node == null) {
            return;
        }

        Node currentNode = node;

        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.next;
        }

    }

    /**
     * @return 返回链表的长度length
     */
    public int length(Node node) {
        int length = 0;
        Node tmp = node;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    /**
     * 反转链表
     */

    public Node reverseList(Node node) {
        //如果链表为空或者只有一个节点，无需反转，直接返回原链表的头结点
        if (node == null || node.next == null) {
            return node;
        }

        Node currentNode = node;
        Node next = null;//定义当前结点的下一个结点
        Node reverseHead = null;//反转后新链表的表头

        while (currentNode != null) {
            next = currentNode.next;//暂时保存住当前结点的下一个结点，因为下一次要用


            currentNode.next = reverseHead;//将current的下一个结点指向新链表的头结点
            reverseHead = currentNode;

            currentNode = next;// 操作结束后，current节点后移
        }

        return reverseHead;

    }

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     */

    public ArrayList<Integer> printListFromTailToHead(Node head) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Node currentNode = head;
        int length = 0;

        while (currentNode != null) {
            length += 1;
            stack.push(currentNode.data);
            currentNode = currentNode.next;
        }

        for (int i = 0; i < length; i++) {
            arrayList.add(stack.pop());
        }

//        System.out.println(Arrays.toString(arrayList.toArray()));


        return arrayList;

    }

    /**
     * @param k：找到链表中倒数第k个节点 * @return 该节点
     *                       * 设置两个指针p1、p2，让p2比p1快k个节点，同时向后遍历，当p2为空，则p1为倒数第k个节点
     */

    public Node findElem(int k) {
        if (k <= 0 || k > length(head)) {
            return null;
        }

        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++) {
            p2 = p2.next;
        }
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }

        return p1;

    }

    /**
     * 合并两个有序链表
     * @param head1
     * @param head2
     * @return
     */

    public Node mergeList(Node head1,Node head2){
        if(head1==null&&head2==null){
            return null;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node mergeNode;
        Node currentNode;
        if(head1.data<=head2.data){
            currentNode=head1;
            mergeNode=currentNode;
            head1=head1.next;
        }else {
            currentNode=head2;
            mergeNode=currentNode;
            head2=head2.next;
        }

        while (head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                currentNode.next=head1;
                currentNode=currentNode.next;
                head1=head1.next;
            }else {
                currentNode.next=head2;
                currentNode=currentNode.next;
                head2=head2.next;
            }
        }

        if(head1==null){
            currentNode.next=head2;
        }
        if(head2==null){
            currentNode.next=head1;
        }
        return mergeNode;
    }



    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10};

        for (int i = 0; i < arr.length; i++) {
            linkList.add(arr[i]);

        }


//        linkList.printNode(linkList.head);
//        linkList.printNode(linkList.reverseList(linkList.head));
//        linkList.printListFromTailToHead(linkList.head);
//        System.out.println(linkList.length(linkList.head));

//        linkList.findElem(0).display();
//        linkList.printNode(linkList.mergeList(linkList.head1,linkList.head));


    }
}
