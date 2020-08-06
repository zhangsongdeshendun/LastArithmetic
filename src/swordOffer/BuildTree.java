package swordOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 07. 重建二叉树
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
        return buildTree(preList, inList);


    }

    private TreeNode buildTree(List<Integer> preList, List<Integer> inList) {
        if (inList == null || inList.size() == 0) {
            return null;
        }
        int rootValue = preList.remove(0);
        TreeNode root = new TreeNode(rootValue);

        int middle = inList.indexOf(rootValue);

        root.left = buildTree(preList, inList.subList(0, middle));
        root.right = buildTree(preList, inList.subList(middle + 1, inList.size()));


        return root;

    }

}
