package algorithm;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {


    public void fun(int[] array) {

        int left = 0;
        int right = array.length - 1;
        int flag = 0;
        while (left < right) {
            if (isJ(array[left])) {
                left++;
                continue;
            }
            if (!isJ(array[right])) {
                right--;
                continue;
            }
            if (left < right) {
                flag = array[left];
                array[left++] = array[right];
                array[right--] = flag;

            }

        }


    }

    public boolean isJ(int index) {
        if (index % 2 == 0) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        ReOrderArray reOrderArray = new ReOrderArray();
        int[] arr = {1,2,3,4,5,6,7};

        reOrderArray.fun(arr);


        System.out.println(Arrays.toString(arr));

    }
}
