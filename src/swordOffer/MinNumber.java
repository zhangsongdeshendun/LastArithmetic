package swordOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 * 这是正确答案
 */
public class MinNumber {


    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        ArrayList<String> list = new ArrayList<>();
        for (int item : nums) {
            list.add(String.valueOf(item));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String x1 = o1 + o2;
                String x2 = o2 + o1;

                return x1.compareTo(x2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : list) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();

    }
}
