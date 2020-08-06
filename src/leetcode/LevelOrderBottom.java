package leetcode;

import java.util.*;

/**
 * 107. 二叉树的层次遍历 II
 * 这是正确答案
 */
public class LevelOrderBottom {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> resultList = new ArrayList<>();

        Stack<List<Integer>> stack = new Stack<>();

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<Integer> tempList = new ArrayList<>();
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
            stack.add(tempList);
        }
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                resultList.add(stack.pop());
            }
        }
        return resultList;


    }
}
