package swordOffer;

/**
 * 剑指 Offer 26. 树的子结构
 * 这是正确答案
 */
public class IsSubStructure {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        boolean result = check(A, B);
        if (result) {
            return true;
        }
        if (A.left != null) {
            boolean result1 = isSubStructure(A.left, B);
            if (result1) {
                return true;
            }

        }

        if (A.right != null) {
            boolean result2 = isSubStructure(A.right, B);
            if (result2) {
                return true;
            }

        }
        return false;


    }

    private boolean check(TreeNode A, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val != b.val) {
            return false;
        }
        return check(A.left, b.left) && check(A.right, b.right);
    }


}
