package swordOfferTestPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationTest {
    private ArrayList<String> result = new ArrayList<>();

    public String[] permutation(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        permutation(s.toCharArray(), 0);
        return result.toArray(new String[result.size()]);
    }

    private void permutation(char[] s, int index) {
        if (s.length - 1 == index) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char item : s) {
                stringBuilder.append(item);
            }
            result.add(stringBuilder.toString());
        } else {
            HashSet<Character> hashSet = new HashSet<>();
            for (int i = index; i < s.length; i++) {
                if (hashSet.contains(s[i])) {
                    continue;
                }
                hashSet.add(s[i]);
                swap(s, index, i);
                permutation(s, index + 1);
                swap(s, index, i);
            }
        }
    }

    private void swap(char[] s, int i, int j) {
        char x = s[i];
        s[i] = s[j];
        s[j] = x;

    }


}
