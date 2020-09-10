package swordOfferTestPractice;

import java.util.LinkedList;
import java.util.Queue;

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
        if (B == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();

            if (check(treeNode, B)) {
                return true;
            }

            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }

            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }

        }
        return false;

    }


    //    public boolean isSameTree(TreeNode A, TreeNode B) {//这种方法的isSameTree 不行，因为A树可能还有结构，A和B不能完全相同
//        if (A == null && B == null) {
//            return true;
//        }
//        if (A == null || B == null) {
//            return false;
//        }
//        if (A.val != B.val) {
//            return false;
//        }
//        return isSameTree(A.left, B.left) && isSameTree(A.right, B.right);
//    }
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
