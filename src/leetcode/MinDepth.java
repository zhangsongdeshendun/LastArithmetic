package leetcode;

/**
 * 这是正确答案
 * 111. 二叉树的最小深度
 *
 */
public class MinDepth {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return check(root);
    }

    private int check(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.left == null && treeNode.right == null) {
            return 1;
        }
        int left = check(treeNode.left) + 1;
        int right = check(treeNode.right) + 1;
        if (treeNode.left == null || treeNode.right == null) {
            return left + right;
        }
        return Math.min(left, right);

    }
}
