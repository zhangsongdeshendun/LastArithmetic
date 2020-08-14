package leetcode;

/**
 * 231. 2的幂
 * 这是正确答案
 */
public class IsPowerOfTwo {


    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;

    }


}
