package leetcodeTest;

import java.util.ArrayList;
import java.util.List;

public class GenerateTest {

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0){
            return result;
        }
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        result.add(firstList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> preList = result.get(i - 1);
            List<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            int index = 0;
            while (index <= preList.size() - 2) {
                currentList.add(preList.get(index) + preList.get(index + 1));
                index++;
            }
            currentList.add(1);
            result.add(currentList);
        }
        return result;


    }


}
