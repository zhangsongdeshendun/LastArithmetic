package leetcodeTest;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf") + "");
    }


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int start = -1;
        int sum = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int temp = hashMap.get(s.charAt(i));
                if (start < temp) {
                    start = temp;
                }
            }
            hashMap.put(s.charAt(i), i);
            sum = Math.max(sum, i - start);


        }
        return sum;

    }

}
