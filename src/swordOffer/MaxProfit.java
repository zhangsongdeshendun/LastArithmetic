package swordOffer;

/**
 * 这是正确答案 63
 *
 * 在遍历数组的过程中，维护一个最小值，最小值初试为 Integer.MAX_VALUE
 *
 * 如果num大于min，则去更新一下利润res
 * 否则说明当前的num比min还小，则更新min
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int item : prices) {
            if (item < min) {
                min = item;
            } else {
                result = Math.max(result, item - min);
            }

        }

        return result;

    }
}
