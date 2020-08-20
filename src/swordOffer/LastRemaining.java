package swordOffer;

/**
 * 剑指 Offer 62. 圆圈中最后剩下的数字
 * 这是正确答案
 */
public class LastRemaining {

    public int lastRemaining(int n, int m) {
        int lastNum = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            lastNum = (lastNum + m) % i;

        }
        return lastNum;

    }
}
