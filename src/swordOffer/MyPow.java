package swordOffer;

/**
 * 这是正确答案
 * 剑指 Offer 16. 数值的整数次方
 *
 */
public class MyPow {


    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double result = 1.0;

        for (int i = n; i != 0; i /= 2) {
            //i是奇数
            if (i % 2 != 0) {
                result *= x;
            }
            x *= x;
        }


        return n > 0 ? result : 1.0 / result;


    }


}
