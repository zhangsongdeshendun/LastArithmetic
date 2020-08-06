package swordOffer;

import algorithm.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 * 这是正确答案
 *
 *    /**
 *      * 思路：
 *      * 1、用深度优先搜索DFS
 *      * 2、每当DFS搜索到新节点时，都要保存该节点。而且每当找出一条路径之后，
 *      *    都将这个保存到list的路径保存到最终结果二维list中
 *      * 3、并且，每当DFS搜索到子节点，发现不是路径和时，返回上一个结点时，
 *      *    需要把该节点从list中移除
 *      */
public class PathSum {
    private List<List<Integer>> result = new ArrayList<>();

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }

        pathSum(root, sum, new ArrayList<Integer>());
        return result;


    }

    private void pathSum(TreeNode root, int target, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        int val = root.val;
        int remindVal = target - val;
        // 当前节点进列表

        list.add(val);
        // 当前节点是叶子节点
        if (remindVal == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
        // 处理叶子节点
        pathSum(root.left, remindVal, list);
        pathSum(root.right, remindVal, list);
        // 回溯到上一个节点
        list.remove(list.size() - 1);

    }


}
