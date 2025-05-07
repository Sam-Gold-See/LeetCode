package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

import java.util.*;

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
    // 104 二叉树的最大深度 二叉树 递归
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(depth(root.left, 1), depth(root.right, 1));
    }

    private int depth(TreeNode node, int sum) {
        return node == null ? sum : Math.max(depth(node.left, sum + 1), depth(node.right, sum + 1));
    }
*/

/*
    // 872 叶子相似的树 二叉树 DFS
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        if (root1 != null)
            dfs(root1, list1);

        List<Integer> list2 = new ArrayList<>();
        if (root2 != null)
            dfs(root2, list2);

        return list1.equals(list2);
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null)
            list.add(node.val);
        else {
            if (node.left != null)
                dfs(node.left, list);
            if (node.right != null)
                dfs(node.right, list);
        }
    }
*/

/*
    // 1448 统计二叉树中好节点的数目 二叉树 DFS
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int max) {
        if (node == null)
            return 0;
        int left = dfs(node.left, Math.max(max, node.val));
        int right = dfs(node.right, Math.max(max, node.val));
        return left + right + (max <= node.val ? 1 : 0);
    }
*/

    /*
        // 437 路径总和 III 二叉树 DFS 前缀和
        private Map<Long, Integer> prefix = new HashMap<>();
        private int target;

        public int pathSum(TreeNode root, int targetSum) {
            prefix = new HashMap<>();
            target = targetSum;

            prefix.put(0L, 1);
            return dfs(root, 0);
        }

        private int dfs(TreeNode node, long curSum) {
            if (node == null)
                return 0;

            int ans = 0;
            curSum += node.val;

            ans += prefix.getOrDefault(curSum - target, 0);
            prefix.put(curSum, prefix.getOrDefault(curSum, 0) + 1);

            int leftAns = dfs(node.left, curSum);
            int rightAns = dfs(node.right, curSum);

            ans = ans + leftAns + rightAns;
            prefix.put(curSum, prefix.get(curSum) - 1);
            return ans;
        }
    */

/*
    // 1372 二叉树中的最长交错路径 二叉树 DFS 模拟
    private int mx = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root, false, 0);
        dfs(root, true, 0);
        return mx;
    }

    private void dfs(TreeNode node, boolean dir, int len) {
        mx = Math.max(mx, len);
        if (!dir) {
            if (node.left != null)
                dfs(node.left, true, len + 1);
            if (node.right != null)
                dfs(node.right, false, 1);
        } else {
            if (node.left != null)
                dfs(node.left, true, 1);
            if (node.right != null)
                dfs(node.right, false, len + 1);
        }
    }
*/

/*
    // 236 二叉树的最近公共祖先 二叉树 DFS
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || node == p || node == q) return node;
        TreeNode left = lowestCommonAncestor(node.left, p, q);
        TreeNode right = lowestCommonAncestor(node.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return node;
    }
*/

/*
    // 700 二叉搜索树中的搜索 二叉树 DFS
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        else if (root.val == val)
            return root;
        else if (root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
*/

/*
    // 700 二叉搜索树中的搜索 二叉树 DFS
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
*/

/*
    // 450 删除二叉搜索树中的节点 二叉树 DFS
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;
            TreeNode t = root.left;
            while (t.right != null) t = t.right;
            t.right = root.right;
            return root.left;
        } else if (root.val < key) root.right = deleteNode(root.right, key);
        else root.left = deleteNode(root.left, key);
        return root;
    }
*/

/*
    // 199 二叉树的右视图 二叉树 BFS
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                    if (i == size - 1)
                        res.add(node.val);
                }
            }
        }
        return res;
    }
*/

/*
    // 1161 最大层内元素和 二叉树 BFS
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE, ansPos = 0, pos = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size() ,curSum = 0;
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                curSum += node.val;
            }
            if (curSum > maxSum) {
                maxSum = curSum;
                ansPos = pos;
            }
            pos++;
        }
        return ansPos;
    }
*/

    @Test
    public void test() {
    }
}
