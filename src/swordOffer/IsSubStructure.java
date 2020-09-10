package swordOffer;


import java.util.LinkedList;
import java.util.Queue;

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
