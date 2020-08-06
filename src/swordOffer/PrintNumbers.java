package swordOffer;

/**
 * 剑指 Offer 17. 打印从1到最大的n位数
 * 这是正确答案
 */
public class PrintNumbers {


    public int[] printNumbers(int n) {
        int target = (int) Math.pow(10, n);
        int[] result = new int[target - 1];
        for (int i = 0; i < target - 1; i++) {
            result[i] = i + 1;
        }

        return result;

    }
}
