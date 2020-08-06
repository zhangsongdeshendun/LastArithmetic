package swordOffer;

/**
 * 剑指 Offer 55 - II. 平衡二叉树
 * 这是正确答案
 */
public class IsBalanced {
    private boolean isBalanced = true;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        res(root);

        return isBalanced;

    }

    private int res(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = res(root.left) + 1;
        int right = res(root.right) + 1;
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right);
    }
}
