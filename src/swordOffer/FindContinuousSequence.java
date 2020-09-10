package swordOffer;

import java.util.ArrayList;

/**
 * Offer 57 - II. 和为s的连续正数序列 这是正确答案
 * 采用滑动窗口的方法
 *
 */
public class FindContinuousSequence {


    public int[][] findContinuousSequence(int target) {

        ArrayList<int[]> result = new ArrayList<>();
        int i = 1;
        int j = 2;
        int currentSum = 3;
        while (j < target) {
            if (currentSum == target) {
                int[] arrayList = new int[j - i+1];
                for (int k = i; k <= j; k++) {
                    arrayList[k - i] = k;
                }
                result.add(arrayList);
                currentSum -= i;
                i++;
            } else if (currentSum < target) {
                j++;
                currentSum += j;

            } else {
                currentSum -= i;
                i++;

            }


        }

        return result.toArray(new int[result.size()][]);

    }


}
