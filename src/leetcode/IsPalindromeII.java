package leetcode;

/**
 * 125. 验证回文串
 */
public class IsPalindromeII {

    public boolean isPalindrome(String s) {

        if (s == null || s.length() <= 0) {
            return true;
        }

        String tem = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < tem.length(); i++) {
            if ((tem.charAt(i) >= '0' && tem.charAt(i) <= '9') || (tem.charAt(i) >= 'a' && tem.charAt(i) <= 'z')) {
                stringBuilder.append(tem.charAt(i));
            }
        }
        String temp = stringBuilder.toString();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
                return false;
            }
        }

        return true;

    }
}
