package leetcode;

/**
 * 263. 丑数
 * 这是正确答案
 */
public class IsUgly {

    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }

        int[] datas = {2, 3, 5};

        for (int item : datas) {
            while (num % item == 0) {
                num = num / item;
            }
        }
        if (num == 1) {
            return true;
        }
        return false;


    }


    public static void main(String[] args) {
        IsUgly isUgly = new IsUgly();
//        System.out.println(isUgly.isUgly(6));
//        System.out.println(isUgly.isUgly(1));
        System.out.println(isUgly.isUgly(8));
//        System.out.println(isUgly.isUgly(14));
//        System.out.println(isUgly.isUgly(7));
    }
}
