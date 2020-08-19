package leetcode;

import java.util.Stack;

/**
 * 700. 二叉搜索树中的搜索
 * 这是正确答案
 */
public class SearchBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                if (root.val == val) {
                    return root;
                }
                root = root.right;
            }
        }
        return null;

    }

}
