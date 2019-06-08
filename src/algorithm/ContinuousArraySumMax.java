package algorithm;

/**
 * 连续子数组的最大和
 */

public class ContinuousArraySumMax {
    public static int getMax(int[] array) {
        int currentMax = array[0];
        int sumMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (currentMax < 0) {
                currentMax = array[i];
            } else {
                currentMax += array[i];
            }
            if (sumMax < currentMax) {
                sumMax = currentMax;
            }
        }

        return sumMax;


    }


    public static void main(String[] args) {


    }
}
