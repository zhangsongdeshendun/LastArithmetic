package leetcodeTest;

import java.util.ArrayList;
import java.util.List;

public class BuildTreeTest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
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
        int val = preList.remove(0);
        TreeNode root = new TreeNode(val);
        int index = inList.indexOf(val);
        root.left = buildTree(preList, inList.subList(0, index));
        root.right = buildTree(preList, inList.subList(index + 1, inList.size()));

        return root;

    }
}
