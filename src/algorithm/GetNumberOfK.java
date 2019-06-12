package algorithm;

/**
 * 统计一个数字在排序数组中出现的次数。
 * <p>
 * <p>
 * 思路：看到排序数组肯定想到二分，然后找到那个数出现的位置，然后分别向两边遍历，因为是那个数是连续的，所以遍历的非常少
 */
public class GetNumberOfK {

    public int fun(int[] array, int k) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int position = getPosition(array, k);

        if (position == -1) {
            return 0;
        }
        int sum = 1;
        for (int i = position + 1; i < array.length; i++) {
            if (array[i] == k) {
                sum++;
                continue;
            }
            break;
        }


        for (int i = position - 1; i >= 0; i--) {
            if (array[i] == k) {
                sum++;
                continue;
            }
            break;
        }

        return sum;

    }


    public int getPosition(int[] array, int k) {
        int left = 0;
        int right = array.length - 1;

        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] < k) {
                left = middle + 1;
            } else if (array[middle] > k) {
                right = middle - 1;
            } else {
                return middle;
            }
            if (left > right) {
                return -1;
            }
        }

        return -1;

    }


    public static void main(String[] args) {
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8};

        System.out.println(getNumberOfK.fun(array, 10));

    }


}
