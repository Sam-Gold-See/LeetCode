package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeTest {

    public static class TreeNode {
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

/*
    // 94 二叉树的中序遍历 二叉树 DFS
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    private void dfs(TreeNode node, List<Integer> ans) {
        if (node != null) {
            dfs(node.left, ans);
            ans.add(node.val);
            dfs(node.right, ans);
        }
    }
*/

/*
    // 104 二叉树的最大深度 二叉树 DFS
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int depth) {
        return node == null ? depth : Math.max(dfs(node.left, depth + 1), dfs(node.right, depth + 1));
    }
*/

/*
    // 226 翻转二叉树 二叉树 DFS
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if(node == null)
            return;
        TreeNode r = node.right;
        node.right = node.left;
        node.left = r;
        dfs(node.left);
        dfs(node.right);
    }
*/

/*
    // 226 翻转二叉树 二叉树 DFS
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
*/

/*
    // 101 对称二叉树 二叉树 DFS
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
*/

/*
    // 543 二叉树的直径 二叉树 DFS
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }
*/

/*
    // 102 二叉树的层序遍历 二叉树 BFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                while (size-- != 0) {
                    TreeNode node = queue.poll();
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                    list.add(node.val);
                }
                ans.add(list);
            }
        }
        return ans;
    }
*/

/*
    // 108 将有序数组转换为二叉搜索树 二叉树
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums, left, mid - 1);
        node.right = dfs(nums, mid + 1, right);
        return node;
    }
*/

/*
    // 98 验证二叉搜索树 二叉树 DFS
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node, long min, long max) {
        if(node == null)
            return true;
        if(node.val<=min || node.val >= max)
            return false;
        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }
*/

    @Test
    public void test() {
    }
}
