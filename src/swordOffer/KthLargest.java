package swordOffer;

import java.util.Stack;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 这是正确答案
 */
public class KthLargest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        Stack<TreeNode> stack = new Stack<>();
        int count = 1;

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.right;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                if (count == k) {
                    return root.val;
                }
                count++;


                root = root.left;


            }

        }
        return -1;

    }
}
