package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 *
 * 这是正确答案
 */
public class BuildTree2 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        ArrayList<Integer> inList = new ArrayList<>();
        ArrayList<Integer> postList = new ArrayList<>();
        for (int i = 0; i < inorder.length; i++) {
            inList.add(inorder[i]);
            postList.add(postorder[i]);

        }
        return buildTree(inList, postList);


    }

    private TreeNode buildTree(List<Integer> inList, List<Integer> postList) {
        if (inList.size() == 0 || postList.size() == 0) {
            return null;
        }
        int rootVal = postList.remove(postList.size() - 1);
        TreeNode root = new TreeNode(rootVal);

        int middle = inList.indexOf(rootVal);

        root.right = buildTree(inList.subList(middle + 1, inList.size()), postList);


        root.left = buildTree(inList.subList(0, middle), postList);




        return root;


    }


}
