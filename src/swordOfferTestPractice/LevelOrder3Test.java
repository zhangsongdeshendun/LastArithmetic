package swordOfferTestPractice;

import algorithm.Tree;

import java.util.*;

public class LevelOrder3Test {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int index = 0;
        queue.add(root);
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (index % 2 == 0) {
                    list.add(treeNode.val);
                } else {
                    stack.push(treeNode.val);

                }
                if (treeNode.left != null)
                    queue.add(treeNode.left);

                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
            while (!stack.isEmpty()) {
                list.add(stack.pop());

            }
            result.add(list);
            index++;

        }
        return result;

    }
}
