package swordOfferTestPractice;

public class MaxDepthTest {

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
        int x = maxDepth(root.left) + 1;
        int y = maxDepth(root.right) + 1;
        return Math.max(x, y);

    }


}
