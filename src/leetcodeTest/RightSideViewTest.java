package leetcodeTest;

import algorithm.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewTest {

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
        Queue<TreeNode> queue = new LinkedList();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }


            }
            result.add(list);


        }
        List<Integer> resultList = new ArrayList<>();
        for (ArrayList<Integer> item : result) {
            resultList.add(item.get(item.size() - 1));
        }
        return resultList;


    }
}
