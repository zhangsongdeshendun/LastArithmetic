package swordOfferTestPractice;

public class IsSubStructureTest {

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
        if (result)
            return true;
        if (A.left != null) {
            boolean result1 = isSubStructure(A.left, B);
            if (result1)
                return true;
        }
        if (A.right != null) {
            boolean result1 = isSubStructure(A.right, B);
            if (result1)
                return true;
        }
        return false;


    }

    private boolean check(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return check(A.left, B.left) && check(A.right, B.right);

    }

}
