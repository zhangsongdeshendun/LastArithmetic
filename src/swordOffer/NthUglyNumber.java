package swordOffer;

/**
 * 剑指 Offer 49. 丑数 正确答案
 */
public class NthUglyNumber {


    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return -1;
        }
        int[] result = new int[n];
        result[0] = 1;
        int j = 0, k = 0, l = 0;
        for (int i = 1; i < n; i++) {
            result[i] = Math.min(Math.min(result[j] * 2, result[k] * 3), result[l] * 5);

            if (result[i] == result[j] * 2) {
                j++;
            }

            if (result[i] == result[k] * 3) {
                k++;
            }

            if (result[i] == result[l] * 5) {
                l++;
            }

        }

        return result[n - 1];

    }


}
