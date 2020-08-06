package swordOffer;

import java.util.ArrayList;

/**
 * Offer 57 - II. 和为s的连续正数序列 这是正确答案
 * 采用滑动窗口的方法
 *
 */
public class FindContinuousSequence {


    public int[][] findContinuousSequence(int target) {

        int i = 1;
        int j = 1;
        int sum = 0;
        ArrayList<int[]> result = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] list = new int[j - i];

                for (int k = i; k < j; k++) {
                    list[k - i] = k;
                }
                result.add(list);
                sum -= i;
                i++;
            }


        }

        return result.toArray(new int[result.size()][]);

    }


}
