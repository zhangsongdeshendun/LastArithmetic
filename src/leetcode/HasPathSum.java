package leetcode;

public class HasPathSum {
    private boolean hasPathSum = false;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        check(root, sum);

        return hasPathSum;


    }

    private void check(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && sum == 0) {
            hasPathSum = true;
        }

        check(root.left, sum - root.val);
        check(root.right, sum - root.val);

    }
}
