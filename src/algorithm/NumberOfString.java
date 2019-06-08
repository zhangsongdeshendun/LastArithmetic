package algorithm;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 一个字符串中字符出现的次数
 */
public class NumberOfString {


    public static TreeMap<Character, Integer> count(String str) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        char[] chars = str.toCharArray();
        for (char index : chars) {
            if (!treeMap.containsKey(index)) {
                treeMap.put(index, 1);
            } else {
                int count = treeMap.get(index);
                treeMap.put(index, count + 1);
            }

        }

        Iterator iter = treeMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key=" + key + "           value=" + value);
        }


        return treeMap;


    }

    public static void main(String[] args) {
        count("qwertyqw");


    }
}
