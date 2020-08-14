package swordOfferTestPractice;

import algorithm.Tree;

import java.util.Stack;

public class KthLargestTest {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        Stack<TreeNode> stack = new Stack<>();
        int count = 1;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.right;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                if (k == count) {
                    return root.val;
                }

                root = root.left;
                count++;
            }
        }
        return -1;

    }
}
