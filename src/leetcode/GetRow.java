package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角 II
 * 这是正确答案
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        int index = rowIndex+1;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        result.add(firstList);
        for (int i = 1; i < index; i++) {

            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            List<Integer> preList = result.get(i - 1);
            for (int j = 1; j < i; j++) {
                currentList.add(preList.get(j - 1) + preList.get(j));
            }
            currentList.add(1);
            result.add(currentList);

        }
        return result.get(result.size()-1);

    }

}
