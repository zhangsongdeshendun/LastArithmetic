package leetcodeTest;

public class IsUglyTest {

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

}
