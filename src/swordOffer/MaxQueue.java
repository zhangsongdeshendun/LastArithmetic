package swordOffer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer 59 - II. 队列的最大值
 * 这是正确答案
 * deque是双端队列 ，两端都可以进，都可以出
 */
public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();

    }

    public int max_value() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.peekFirst();


    }

    public void push_back(int value) {
        queue.add(value);
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.removeLast();
        }
        deque.addLast(value);


    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int val = queue.poll();
        if (val == max_value()) {
            deque.removeFirst();
        }
        return val;


    }
}
