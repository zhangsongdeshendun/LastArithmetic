package leetcodeTest;

/**
 * 5. 最长回文子串
 */
public class LongestPalindrome {


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
                int len = r - l + 1;
                if (len > maxCount) {
                    maxCount = len;
                    left = l;
                    right = r;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - l + 1;
                if (len > maxCount) {
                    maxCount = len;
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
