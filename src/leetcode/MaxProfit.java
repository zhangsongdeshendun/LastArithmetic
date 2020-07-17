package leetcode;

public class MaxProfit {


    public int maxProfit(int[] prices) {


        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                result = Math.max(result, prices[i] - min);
            }
        }

        return result;


    }


}
