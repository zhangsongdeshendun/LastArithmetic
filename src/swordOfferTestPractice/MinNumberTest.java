package swordOfferTestPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumberTest {

    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int item : nums) {
            arrayList.add(String.valueOf(item));
        }

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String x1 = o1 + o2;
                String x2 = o2 + o1;
                return x1.compareTo(x2);
            }
        });
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            result.append(arrayList.get(i));
        }
        return result.toString();


    }

}
