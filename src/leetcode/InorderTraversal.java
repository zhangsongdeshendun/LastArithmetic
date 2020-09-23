package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * 94. 二叉树的中序遍历
 * 这是正确答案
 */
public class InorderTraversal {


    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> data = new ArrayList<>();
        Stack<TreeNode> temp = new Stack<>();

        TreeNode treeNode = root;
        while (treeNode != null || !temp.empty()) {
            /*
             * 当前节点入栈，treenode指向当前节点的left节点
             */
            while (treeNode != null) {
                temp.push(treeNode);
                treeNode = treeNode.left;
            }

            //
            if (!temp.empty()) {
                treeNode = temp.pop();
                data.add(treeNode.val);
                treeNode = treeNode.right;
            }

        }
        return data;

    }

}
