package leetcode;

/**
 * 701. 二叉搜索树中的插入操作
 * 这是自己做出来的
 */
public class InsertIntoBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }


        TreeNode currentNode = root;
        TreeNode parentNode = root;
        while (currentNode != null) {
            if (currentNode.val > val) {
                parentNode = currentNode;
                currentNode = currentNode.left;

            } else {
                parentNode = currentNode;
                currentNode = currentNode.right;
            }

        }
        if (parentNode.val > val) {
            parentNode.left = new TreeNode(val);
        } else {
            parentNode.right = new TreeNode(val);
        }
        return root;


    }

}
