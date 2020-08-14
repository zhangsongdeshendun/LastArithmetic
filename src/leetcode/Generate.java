package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 这是正确答案
 */
public class Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        result.add(firstList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentList = new ArrayList<>();
            List<Integer> preList = result.get(i - 1);
            currentList.add(1);
            for (int j = 1; j < i; j++) {
                currentList.add(preList.get(j - 1) + preList.get(j));
            }

            currentList.add(1);
            result.add(currentList);

        }
        return result;


    }


}
