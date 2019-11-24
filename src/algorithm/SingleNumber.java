package algorithm;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * <p>
 * <p>
 * 思路：其实只要记住：
 * 1.异或满足交换律。
 * 2.相同两个数异或为0。
 * 3.0异或一个数为那个数本身。
 */
public class SingleNumber {

    public int fun(int[] A) {
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            index ^= A[i];
        }

        return index;

    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] arr = {1, 1, 2, 2, 5, 6, 6, 5, 10};
        System.out.println(singleNumber.fun(arr));


    }
}
