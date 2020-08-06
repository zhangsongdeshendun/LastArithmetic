package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 199. 二叉树的右视图
 * 这是正确答案
 *
 */
public class RightSideView {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        while (!queue.isEmpty()) {

            int size = queue.size();
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                tempList.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            list.add(tempList);

        }
        List<Integer> resultList = new ArrayList<>();
        for (ArrayList<Integer> item : list) {
            resultList.add(item.get(item.size() - 1));
        }

        return resultList;


    }
}
