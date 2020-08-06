package leetcode;

/**
 * 110. 平衡二叉树
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
        check(root);

        return isBalanced;


    }

    private int check(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = check(treeNode.left) + 1;
        int right = check(treeNode.right) + 1;
        if (Math.abs(right - left) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right);

    }

}
