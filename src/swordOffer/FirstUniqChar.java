package swordOffer;

import java.util.HashMap;
/**
 * 50题 这是正确答案
 */
public class FirstUniqChar {

    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character c : chars) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        for (Character c : chars) {
            if (hashMap.get(c) == 1) {
                return c;
            }
        }
        return ' ';


    }

}
