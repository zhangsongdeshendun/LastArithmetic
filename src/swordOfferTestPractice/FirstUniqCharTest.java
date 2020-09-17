package swordOfferTestPractice;

import java.util.HashMap;

public class FirstUniqCharTest {
    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return ' ';
        }
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int count = hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i), ++count);

            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';

    }

}
