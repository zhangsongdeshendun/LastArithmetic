package leetcodeTest;

public class CountPrimesTest {

    public static void main(String[] args) {
        CountPrimesTest countPrimesTest = new CountPrimesTest();
        countPrimesTest.countPrimes(3);
    }

    public int countPrimes(int n) {
        n--;
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimes(i)) {
                count++;
            }

        }
        return count;

    }

    private boolean isPrimes(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
