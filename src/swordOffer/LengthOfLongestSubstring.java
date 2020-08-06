package swordOffer;

import java.util.HashMap;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * 这是正确答案
 */
public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int start = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (hashMap.containsKey(item)) {

                int index = hashMap.get(item);
                if (index > start) {
                    start = index;
                }
            }
            hashMap.put(item, i);
            max = Math.max(max, i - start);
        }

        return max;

    }


}
