package leetcode;

/**
 * 这是正确答案
 *
 * 104. 二叉树的最大深度
 *
 */
public class MaxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int a = maxDepth(root.left) + 1;
        int b = maxDepth(root.right) + 1;

        return a > b ? a : b;

    }
}
