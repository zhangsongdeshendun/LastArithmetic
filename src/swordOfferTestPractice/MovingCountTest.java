package swordOfferTestPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MovingCountTest {
    public int movingCount(int m, int n, int k) {

        boolean[][] matrix = new boolean[m][n];
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(0);
        queue.add(arrayList);
        int count = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = queue.poll();
            int i = list.get(0);
            int j = list.get(1);
            if (i >= m || j >= n || k < getSum(i, j) || matrix[i][j]) {
                continue;
            }
            matrix[i][j] = true;
            count++;
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(i + 1);
            arrayList1.add(j);

            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i);
            arrayList2.add(j + 1);

            queue.add(arrayList1);
            queue.add(arrayList2);

        }
        return count;

    }

    private int getSum(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i = i / 10;
        }
        while (j != 0) {
            sum += j % 10;
            j = j / 10;
        }
        return sum;

    }

}
