package leetcodeTest;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {


        if (numbers == null || numbers.length <= 1) {
            return new int[0];
        }

        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left;
                result[1] = right;
                break;

            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else {
                left++;
            }

            if(left>=right){
                return new int[0];
            }
        }

        result[0]=result[0]+1;
        result[1]=result[1]+1;
        return result;

    }

}
