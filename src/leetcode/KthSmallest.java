package leetcode;

import algorithm.Tree;

import java.util.Stack;

/**
 * 230. 二叉搜索树中第K小的元素
 * 这是正确答案
 */
public class KthSmallest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        Stack<TreeNode> stack = new Stack<>();
        int count = 1;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                if (k == count) {
                    return root.val;
                }
                root = root.right;
                count += 1;
            }
        }

        return -1;

    }
}
