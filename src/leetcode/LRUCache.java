package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * 这是正确答案
 *
 * 146. LRU缓存机制
 */
public class LRUCache {

    private Stack<Integer> stack;
    private HashMap<Integer, Integer> hashMap;
    private int capacity;

    public LRUCache(int capacity) {
        stack = new Stack<>();
        hashMap = new HashMap<>(capacity);
        this.capacity = capacity;

    }

    public int get(int key) {
        if(!stack.contains(key)){
            return -1;
        }
        stack.remove(Integer.valueOf(key));
        stack.push(key);
        return hashMap.get(key);


    }

    public void put(int key, int value) {
        if (stack.contains(key)) {
            stack.remove(Integer.valueOf(key));

        } else {
            if (stack.size() == capacity) {
                int index = stack.remove(0);
                hashMap.remove(index);
            }

        }
        stack.push(key);
        hashMap.put(key, value);


    }
}
