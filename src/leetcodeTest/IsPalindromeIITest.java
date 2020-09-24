package leetcodeTest;

public class IsPalindromeIITest {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                stringBuilder.append(s.charAt(i));

            }
        }
        char[] result = stringBuilder.toString().toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[result.length - 1 - i]) {
                return false;
            }
        }
        return true;

    }
}
