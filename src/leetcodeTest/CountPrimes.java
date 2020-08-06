package leetcodeTest;

/**
 * 204. 计数质数
 */
public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(10) + "");
    }

    public int countPrimes(int n) {

        if (n < 0) {
            return 0;
        }
        int currentCount = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimes(i)) {
                currentCount++;
            }
        }

        return currentCount;

    }

    public static boolean isPrimes(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <=Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


}
