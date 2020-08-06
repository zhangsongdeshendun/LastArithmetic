package swordOffer;

import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * 这是正确答案
 */
public class levelOrder3 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = queue.size(); i > 0; i--) {
                TreeNode treeNode = queue.poll();
                if (index % 2 == 0) {
                    list.add(treeNode.val);
                } else {
                    stack.push(treeNode.val);
                }
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }

            }

            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
            index++;
            stack.clear();
            result.add(list);

        }
        return result;


    }
}
