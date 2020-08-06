package leetcodeTest;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf") + "");
    }


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() <= 0) {
            return 0;
        }
        int maxSum = 1;
        char[] array = s.toCharArray();
        String target = array[0] + "";

        for (int i = 1; i < array.length; i++) {
            if (!target.contains(array[i] + "")) {
                target += array[i];

            } else {
                target = array[i] + "";
            }

            if (target.length() > maxSum) {
                maxSum = target.length();
            }

        }

        return maxSum;

    }

}
