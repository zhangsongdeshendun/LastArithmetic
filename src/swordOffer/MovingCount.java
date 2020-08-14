package swordOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 13. 机器人的运动范围
 * 这是正确答案
 */
public class MovingCount {
    public int movingCount(int m, int n, int k) {
        boolean[][] matrix = new boolean[m][n];
        Queue<List<Integer>> queue = new LinkedList<>();
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(0);
        firstList.add(0);
        queue.add(firstList);
        int count = 0;

        while (!queue.isEmpty()) {
            List<Integer> tempList = queue.poll();
            int i = tempList.get(0);
            int j = tempList.get(1);
            if (i >= m || j >= n || k < getSum(i, j) || matrix[i][j]) {
                continue;
            }
            matrix[i][j] = true;
            count++;
            ArrayList<Integer> List1 = new ArrayList<>();
            List1.add(i + 1);
            List1.add(j);

            ArrayList<Integer> List2 = new ArrayList<>();
            List2.add(i);
            List2.add(j + 1);

            queue.add(List1);
            queue.add(List2);


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
