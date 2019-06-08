package algorithm;

/**
 * 判断一个字符串是否是回文串
 */
public class CheckPalindrome {

    public static boolean isPalindrome(String str) {
        boolean flag = true;
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("noon"));

    }


}
