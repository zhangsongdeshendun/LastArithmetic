package algorithm;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {

    public static int getNum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int currentIndex = array[0];
        int currentTime = 1;
        for (int i = 1; i < array.length; i++) {
            if (currentIndex == array[i]) {
                currentTime++;
            } else {
                currentTime--;
                if (currentTime <= 0) {
                    currentIndex = array[i];
                    currentTime = 1;
                }
            }
        }
        currentTime = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == currentIndex) {
                currentTime++;

            }
        }
        if (currentTime * 2 > array.length)
            return currentIndex;

        return 0;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 4};
        System.out.println(getNum(arr));


    }
}


