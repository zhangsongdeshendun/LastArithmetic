package swordOfferTestPractice;

public class MyPowTest {

    public double myPow(double x, int n) {

        double result = 1.0;
        if (n == 0) {
            return result;
        }
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                result *= x;
            }
            x *= x;
        }
        return n > 0 ? result : 1 / result;

    }
}
