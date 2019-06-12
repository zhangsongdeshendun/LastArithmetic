package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * 思路：当3和32比大小的时候332比323大
 */
public class PrintMinNumber {


    public String fun(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : numbers) {
            arrayList.add(i);
        }


        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String x = o1 + "" + o2;
                String y = o2 + "" + o1;
                return (int) (Long.valueOf(x)-Long.valueOf(y));
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <arrayList.size(); i++) {
            stringBuilder.append(arrayList.get(i));
        }


        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        PrintMinNumber printMinNumber = new PrintMinNumber();
        System.out.println(printMinNumber.fun(arr));

    }


}
