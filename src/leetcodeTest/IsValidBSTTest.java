package leetcodeTest;

import java.util.ArrayList;
import java.util.Stack;

public class IsValidBSTTest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                arrayList.add(root.val);
                root = root.right;
            }

        }

        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i) >= arrayList.get(i + 1)) {
                    return false;
                }

            }
        }

        return true;


    }

}
