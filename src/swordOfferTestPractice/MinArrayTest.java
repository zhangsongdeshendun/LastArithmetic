package swordOfferTestPractice;

public class MinArrayTest {

    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (numbers[middle] > numbers[right]) {
                left = middle+1;
            } else if (numbers[middle] < numbers[right]) {
                right = middle ;
            } else {
                right--;
            }

        }
        return numbers[left];

    }


}
































