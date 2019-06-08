package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {


    public void fun(int[] array) {
        ArrayList<Integer> arrJ = new ArrayList<>();
        ArrayList<Integer> arrO = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isJ(array[i])) {
                arrJ.add(array[i]);
            } else {
                arrO.add(array[i]);
            }
        }

        for (int i = 0; i < arrJ.size(); i++) {
            array[i] = arrJ.get(i);
        }

        for (int i = 0; i < arrO.size(); i++) {
            array[arrJ.size() + i] = arrO.get(i);
        }


    }

    public boolean isJ(int index) {
        if (index % 2 == 0) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        ReOrderArray reOrderArray=new ReOrderArray();
        int[] arr = {1, 5, 4, 3, 2, 6};

        reOrderArray.fun(arr);


        System.out.println(Arrays.toString(arr));

    }
}
