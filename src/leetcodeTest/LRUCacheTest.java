package leetcodeTest;

import java.util.HashMap;
import java.util.Stack;

public class LRUCacheTest {
    private HashMap<Integer, Integer> hashMap;
    private Stack<Integer> stack;
    private int capacity;

    private LRUCacheTest(int capacity) {
        hashMap = new HashMap<>(capacity);
        stack = new Stack<>();
        this.capacity = capacity;


    }

    private int get(int key) {
        if (!stack.contains(Integer.valueOf(key))) {
            return -1;
        }
        stack.remove(0);
        stack.push(Integer.valueOf(key));
        return hashMap.get(key);


    }

    private void put(int key, int value) {
        if (stack.contains(Integer.valueOf(key))) {
            stack.remove(Integer.valueOf(key));
        } else {
            if (stack.size() == capacity) {
                stack.remove(0);
            }
        }

        stack.push(Integer.valueOf(key));
        hashMap.put(key, value);


    }


}
