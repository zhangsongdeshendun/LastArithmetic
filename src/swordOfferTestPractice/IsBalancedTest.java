package swordOfferTestPractice;

public class IsBalancedTest {
    private boolean isBalanced=true;

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

    private int check(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = check(root.left) + 1;
        int right = check(root.right) + 1;
        if (Math.abs(left - right) > 1) {
            isBalanced = false;

        }
        return Math.max(left, right);

    }
}
