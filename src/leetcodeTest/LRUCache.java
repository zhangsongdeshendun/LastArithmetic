package leetcodeTest;

import java.util.HashMap;
import java.util.Stack;

public class LRUCache {
    public Stack<Integer> stack;
    public HashMap<Integer, Integer> hashMap;
    public int capacity;

    public LRUCache(int capacity) {
        stack = new Stack<>();
        hashMap = new HashMap<>(capacity);
        this.capacity = capacity;

    }

    public int get(int key) {
        if (!stack.contains(Integer.valueOf(key))) {
            return -1;
        }

        stack.remove(Integer.valueOf(key));
        stack.push(Integer.valueOf(key));
        return hashMap.get(key);


    }

    public void put(int key, int value) {

        if (stack.contains(Integer.valueOf(key))) {
            stack.remove(Integer.valueOf(key));
        } else {
            if (stack.size() == capacity) {
                int target = stack.remove(0);
                hashMap.remove(target);
            }
        }
        stack.push(Integer.valueOf(key));
        hashMap.put(key, value);

    }

}
