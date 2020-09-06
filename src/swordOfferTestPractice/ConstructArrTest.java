package swordOfferTestPractice;

public class ConstructArrTest {

    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        int index = 1;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = index;
            index *= a[i];
        }
        index=1;

        for (int i = a.length - 1; i >= 0; i--) {
            b[i] *= index;
            index *= a[i];
        }
        return b;

    }
}
