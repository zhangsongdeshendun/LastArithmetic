package leetcodeTest;

import java.util.*;

public class InorderTraversalTest {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> queue = new Stack<>();
        while (!queue.isEmpty() || root != null) {
            while (root != null) {
                queue.add(root);
                root = root.left;

            }
            if (!queue.isEmpty()) {
                root = queue.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;

    }

}
