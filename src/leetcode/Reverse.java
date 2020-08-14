package leetcode;

/**
 * 7. 整数反转
 * 这是正确答案
 */
public class Reverse {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int t = x % 10;
            int tempResult = result * 10 + t;
            if ((tempResult - t) / 10 != result) {
                return 0;
            }
            x = x / 10;
            result = tempResult;
        }
        return result;

    }

    public static void main(String[] args) {

        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(-1534) + "");

    }
}
