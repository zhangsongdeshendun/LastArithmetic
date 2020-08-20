package algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        Deque<Integer> deque=new LinkedList<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println("tail="+deque.peekLast()+ "   head="+deque.peekFirst());
    }
}
