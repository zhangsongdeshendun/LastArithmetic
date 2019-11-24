package leetcode;


import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p>
 * <p>
 * 给定一个整数数组，找到两个数字，使它们加起来一个特定的目标数。
 * <p>
 * 函数twoSum应返回两个数字的索引，以便它们加起来到目标，其中index1必须小于index2。 请注意，您返回的答案（index1和index2）不是从零开始的。
 * <p>
 * 您可以假设每个输入都只有一个解决方案。
 * <p>
 * 输入：数字= {2,7,11,15}，目标= 9
 * 输出：index1 = 1，index2 = 2
 * <p>
 * <p>
 * 思路，首先这没有空间要求，所以可以考虑hashmap，而且这不是排序数组，不能采用二分法
 *
 * 这是正确答案
 *
 * 1. 两数之和
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        if (numbers == null || numbers.length <= 1)
            return null;

        int[] array = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(numbers[i])) {
                array[0] = hashMap.get(numbers[i])+1;
                array[1] = i + 1;
                return array;
            } else {
                hashMap.put(target - numbers[i], i);
            }

        }

        return null;

    }


    public static void main(String[] args) {


    }
}
