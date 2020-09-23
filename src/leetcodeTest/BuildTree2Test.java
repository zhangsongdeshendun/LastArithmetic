package leetcodeTest;

import java.util.ArrayList;
import java.util.List;

public class BuildTree2Test {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();
        for (int i = 0; i < inorder.length; i++) {
            inList.add(inorder[i]);
            postList.add(postorder[i]);
        }
        return buildTree(inList, postList);

    }

    public TreeNode buildTree(List<Integer> inList, List<Integer> postList) {
        if (inList == null || inList.size() == 0) {
            return null;
        }
        int val = postList.remove(postList.size() - 1);
        TreeNode root = new TreeNode(val);
        int index = inList.indexOf(val);

        root.right = buildTree(inList.subList(index + 1, inList.size()), postList);
        root.left = buildTree(inList.subList(0, index), postList);
        return root;


    }

}
