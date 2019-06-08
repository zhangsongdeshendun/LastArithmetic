package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 找到连续数组和为sum，并且乘机最小
 */
public class FindNumbersWithSum {

    public static ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {

        ArrayList<Integer> arrayList = new ArrayList<>();


        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] > sum) {
                right--;
            } else if (array[left] + array[right] < sum) {

                left++;
            } else if (array[left] + array[right] == sum) {

                arrayList.add(array[left]);
                arrayList.add(array[right]);
                break;
            }
            if (left > right) {
                break;
            }

        }

        return arrayList;

    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> arrayList = findNumbersWithSum(arr, 9);

        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
