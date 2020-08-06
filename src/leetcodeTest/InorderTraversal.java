package leetcodeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * /**
 * * 二叉树非递归中序遍历思路
 * * 本质其实是类似于双指针
 * * 一个指向前一个节点，另一个指向正在遍历的节点
 * * 1)若其左孩子不为空，则将P入栈并将P的左孩子置为当前的P，然后对当前结点P再进行相同的处理；
 * * 2)若其左孩子为空，则取栈顶元素并进行出栈操作，访问该栈顶结点，然后将当前的P置为栈顶结点的右孩子；
 * * 3)直到P为NULL并且栈为空则遍历结束。
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
