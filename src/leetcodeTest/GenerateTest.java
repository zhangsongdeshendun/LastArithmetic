package leetcodeTest;

import java.util.ArrayList;
import java.util.List;

public class GenerateTest {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList = new ArrayList<>();
        if (numRows <= 0) {
            return resultList;
        }

        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        resultList.add(firstList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> preList = resultList.get(i - 1);
            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            for (int j = 1; j < i; j++) {
                currentList.add(preList.get(j - 1) + preList.get(j));

            }
            currentList.add(1);
            resultList.add(currentList);

        }
        return resultList;

    }


}
