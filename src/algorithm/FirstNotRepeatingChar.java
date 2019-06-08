package algorithm;

import java.util.HashMap;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class FirstNotRepeatingChar {

    public int fun(String str) {
        if (str == null || str.length() == 0)
            return -1;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }


        return index;
    }

    public static void main(String[] args) {
        FirstNotRepeatingChar firstNotRepeatingChar = new FirstNotRepeatingChar();
        System.out.println(firstNotRepeatingChar.fun("111111111")+"");
    }
}
