package leetcodeTest;

import algorithm.Tree;

public class InsertIntoBSTTest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode current = root;
        TreeNode pre = null;
        while (current != null) {
            if (current.val > val) {

                pre = current;
                current = current.left;
            } else {

                pre = current;
                current = current.right;
            }
        }
        if (pre.val > val) {
            pre.left = new TreeNode(val);
        } else {
            pre.right = new TreeNode(val);
        }

        return root;


    }
}
