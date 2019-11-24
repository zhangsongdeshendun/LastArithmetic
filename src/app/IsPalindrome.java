package app;

public class IsPalindrome {
    public boolean isPalindrome(int x) {

        char[] array = String.valueOf(x).toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(-121));
    }


}
