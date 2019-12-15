package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 179. 最大数
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {

        ArrayList<String> strings = new ArrayList<>();
        for (Integer index : nums) {
            strings.add(index + "");
        }
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String x1 = o1 + o2;
                String x2 = o2 + o1;
                if (Long.valueOf(x1) > Long.valueOf(x2)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        if (strings.get(0).charAt(0) == '0') {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str);
        }

        return stringBuilder.toString();

    }
}
