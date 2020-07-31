package com.fxs.leetcode;


/**
 * level: simple
 * title:二叉树的最大深度
 * example：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 * result:
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：40.2 MB, 在所有 Java 提交中击败了5.75%的用户
 *
 * @author hjfeng
 * @date 2020--07--28  21:49
 */
public class MaxDepth {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        int depth = 0;

        return getDepth(root, depth);
    }

    public int getDepth(TreeNode root, int depth){
        if (root != null){
            depth += 1;
            return Math.max(getDepth(root.left,depth),getDepth(root.right,depth));
        }
        return depth;

    }

    public static void main(String[] args) {
        MaxDepth demo = new MaxDepth();

        TreeNode root = new TreeNode(3);
        TreeNode leaf1 = new TreeNode(9);
        TreeNode leaf2 = new TreeNode(20);
        TreeNode leaf3 = new TreeNode(15);
        TreeNode leaf4 = new TreeNode(7);

        root.left = leaf1;
        root.right = leaf2;
        leaf2.left = leaf3;
        leaf2.right = leaf4;


        int res = demo.maxDepth(root);

        System.out.println(res);

    }
}
