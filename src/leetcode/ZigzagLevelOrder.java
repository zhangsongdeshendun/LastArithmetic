package leetcode;


import java.util.*;

/**
 * 103. 二叉树的锯齿形层次遍历
 * 这是正确答案
 */
public class ZigzagLevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        queue.add(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();

                if (index % 2 == 0) {
                    tempList.add(treeNode.val);

                } else {
                    stack.push(treeNode.val);

                }

                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }

            }
            if (!stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    tempList.add(stack.pop());
                }
            }
            result.add(tempList);
            index++;
            stack.clear();


        }

        return result;
    }

}
