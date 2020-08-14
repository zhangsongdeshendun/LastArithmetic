package leetcodeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversalTest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }


    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> resultList = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            resultList.add(treeNode.val);

            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }

            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }


        }
        return resultList;

    }
}
