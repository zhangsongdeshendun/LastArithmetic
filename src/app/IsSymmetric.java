package app;

/**
 * 这是正确答案
 */
public class IsSymmetric {

    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int value;

        public TreeNode(int value) {
            this.value = value;
        }
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);

    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.value != right.value) {
            return false;
        }
        return isSymmetric(left.right, right.left) && isSymmetric(left.left, right.right);

    }
}
