package com.leetcode.spring25.LeetCode100;

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

/*
    // 230 二叉搜索树中第 K 小的元素 二叉树 优先队列
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        dfs(root, pq);
        while (--k != 0)
            pq.poll();
        return pq.poll();
    }

    private void dfs(TreeNode node, PriorityQueue<Integer> pq) {
        if (node == null)
            return;
        pq.add(node.val);
        dfs(node.left, pq);
        dfs(node.right, pq);
    }
*/

/*
    // 230 二叉搜索树中第 K 小的元素 二叉树 优先队列
    private int res, k;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (k == 0) return;
        if (--k == 0) res = node.val;
        dfs(node.right);
    }
*/

/*
    // 199 二叉树的右视图 二叉树 BFS
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size-- > 0) {
                    TreeNode node = queue.poll();
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                    if (size == 0)
                        ans.add(node.val);
                }
            }
        }
        return ans;
    }
*/

/*
    // 114 二叉树展开为链表 二叉树 DFS
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null)
            root = root.right;
        root.right = temp;
    }
*/

/*
    // 105 从前序与中序遍历序列构造二叉树 二叉树 DFS
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < preorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                int[] preLeft = Arrays.copyOfRange(preorder, 1, i + 1);
                int[] preRight = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                int[] inLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inRight = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                root.left = buildTree(preLeft, inLeft);
                root.right = buildTree(preRight, inRight);
                break;
            }
        }
        return root;
    }
*/

/*
    // 105 从前序与中序遍历序列构造二叉树 二叉树 DFS
    private int[] pre, in;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        in = inorder;
        return dfs(0, pre.length - 1, 0, in.length - 1);
    }

    private TreeNode dfs(int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight)
            return null;
        TreeNode node = new TreeNode(pre[preLeft]);
        for (int i = inLeft; i <= inRight; i++) {
            if (pre[preLeft] == in[i]) {
                int leftSize = i - inLeft;
                node.left = dfs(preLeft + 1, preLeft + leftSize, inLeft, i - 1);
                node.right = dfs(preLeft + leftSize + 1, preRight, i + 1, inRight);
                break;
            }
        }
        return node;
    }
*/

/*
    // 437 路径总和 III 二叉树 DFS 前缀和
    private Map<Long, Integer> prefix;
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

        int left = dfs(node.left, curSum);
        int right = dfs(node.right, curSum);

        prefix.put(curSum, prefix.get(curSum) - 1);

        ans += left + right;
        return ans;
    }
*/

/*
    // 236 二叉树的最近公共祖先 二叉树 DFS
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
*/

    @Test
    public void test() {
    }
}
