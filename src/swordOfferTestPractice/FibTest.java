package swordOfferTestPractice;

public class FibTest {

    public int fib(int n) {
        int[] result = new int[n + 2];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 1000000007;
        }

        return result[n];


    }
}
