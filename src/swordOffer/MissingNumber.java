package swordOffer;

/**
 * 这是正确答案  Offer 53 - II. 0～n-1中缺失的数字
 *
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {


        int start = 0;
        int end = nums.length - 1;//长度为n-1的递增排序数组的坐标为[0,n-2];
        while (start <= end) {//包括等于
            int mid = (start + end) / 2;
            if (nums[mid] == mid) {
                //此时若不用return,使用res=mid+1存储结果的话，后面应有break，否则此时start,end,mid都不变会陷入死循环;
                if (mid == nums.length - 1) return mid + 1;//此时n-1缺失，返回n-2+1=mid+1;
                else start = mid + 1;
            } else {//nums[mid]!=mid，此时需要判断nums[mid]是不是第一个坐标和值不相等的数字，若是，则返回其坐标mid
                if (mid == 0 || nums[mid - 1] == mid - 1) return mid;
                else end = mid - 1;
            }
        }
        return -1;//输入的数组格式不符合题意时，比如nums.length=0时，不会进入while循环，直接返回-1;
    }

}
