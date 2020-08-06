package swordOfferTestPractice;

public class MaxProfitTest {


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
