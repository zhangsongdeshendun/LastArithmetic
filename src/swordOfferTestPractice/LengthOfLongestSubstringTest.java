package swordOfferTestPractice;

import java.util.HashMap;

public class LengthOfLongestSubstringTest {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int max = 0;
        int start = -1;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (hashMap.containsKey(item)) {
                int position = hashMap.get(item);

                if (position > start) {
                    start = position;

                }

            }

            hashMap.put(item, i);
            max = Math.max(max, i - start);
        }
        return max;

    }


}
