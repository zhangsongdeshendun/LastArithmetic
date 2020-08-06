package swordOfferTestPractice;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequenceTest {

    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> result = new ArrayList<>();
        int i = 1;
        int j = 1;
        int sum = 0;
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
