package swordOfferTestPractice;

import java.util.ArrayList;
import java.util.List;

public class PathSumTest {
    List<List<Integer>> result = new ArrayList<>();

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }
        pathSum(root, sum, new ArrayList<Integer>());
        return result;


    }

    private void pathSum(TreeNode root, int sum, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        int val = root.val;
        int remind = sum - val;
        list.add(val);
        if (remind == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
        pathSum(root.left, remind, list);
        pathSum(root.right, remind, list);
        list.remove(list.size() - 1);

    }

}
