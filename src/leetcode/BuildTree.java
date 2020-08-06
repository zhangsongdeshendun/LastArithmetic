package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 这是正确答案
 */
public class BuildTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        ArrayList<Integer> preList = new ArrayList<>();
        ArrayList<Integer> inList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preList.add(preorder[i]);
            inList.add(inorder[i]);
        }
        return check(preList, inList);


    }

    private TreeNode check(List<Integer> preList, List<Integer> inList) {
        if (inList == null || inList.size() == 0) {
            return null;
        }
        int rootVal = preList.remove(0);
        TreeNode root = new TreeNode(rootVal);

        int middle = inList.indexOf(rootVal);

        root.left = check(preList, inList.subList(0, middle));
        root.right = check(preList, inList.subList(middle + 1, inList.size()));


        return root;

    }
}
