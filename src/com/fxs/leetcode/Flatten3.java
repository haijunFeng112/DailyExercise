package com.fxs.leetcode;

/**二叉树展开为链表---》寻找前驱节点
 * 例如，给定二叉树
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * 将其展开为：
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 * level:mid
 * @author hjfeng
 * @date 2020--08--02  22:28
 */
public class Flatten3 {

    public void flatten(TreeNode root){
        TreeNode curr = root;
        while (curr != null){
            if (curr.left != null){
                TreeNode next = curr.left;
                TreeNode predeceddor = next;
                while (predeceddor.right != null){
                    predeceddor = predeceddor.right;
                }
                predeceddor.right = curr.right;
                curr.left = null;
                curr.right = next;
            }
            curr = curr.right;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}
