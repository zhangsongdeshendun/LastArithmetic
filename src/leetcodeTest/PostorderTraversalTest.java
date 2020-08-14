package leetcodeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalTest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }


    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode treeNode = stack1.pop();
            stack2.push(treeNode);

            if (treeNode.left != null) {
                stack1.push(treeNode.left);
            }
            if (treeNode.right != null) {
                stack1.push(treeNode.right);
            }
        }
        List<Integer> resultList = new ArrayList<>();

        while (!stack2.isEmpty()) {
            resultList.add(stack2.pop().val);
        }
        return resultList;

    }


}
