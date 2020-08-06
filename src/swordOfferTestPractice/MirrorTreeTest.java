package swordOfferTestPractice;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTreeTest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null)
                queue.add(treeNode.left);

            if (treeNode.right != null)
                queue.add(treeNode.right);

            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;

        }
        return root;


    }
}
