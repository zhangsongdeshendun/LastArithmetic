package leetcode;

import java.util.HashMap;

public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int start = -1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int index = hashMap.get(s.charAt(i));
                if (start < index) {
                    start = index;
                }

            }
            hashMap.put(s.charAt(i), i);
            sum = Math.max(sum, i - start);
        }
        return sum;

    }


}
