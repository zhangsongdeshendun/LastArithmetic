package app;

public class LongestPalindromeTest {

    public String longestPalindrome(String s) {

        if (s == null || s.length() <= 0) {
            return s;
        }

        int maxCount = 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int count = r - l + 1;
                if (count > maxCount) {
                    maxCount = count;
                    left = l;
                    right = r;
                }
                l--;
                r++;

            }
            l = i;
            r = i + 1;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int count = r - l + 1;
                if (count > maxCount) {
                    maxCount = count;
                    left = l;
                    right = r;
                }
                l--;
                r++;

            }

        }

        return s.substring(left, right + 1);

    }
}
