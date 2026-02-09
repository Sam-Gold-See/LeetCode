package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/2/9 10:00
 */
public class BinaryTreeTest {

/*
	// 94. 二叉树的中序遍历 递归
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		dfs(ans, root);
		return ans;
	}

	private void dfs(List<Integer> ans, TreeNode node) {
		if (node == null) {
			return;
		}
		dfs(ans, node.left);
		ans.add(node.val);
		dfs(ans, node.right);
	}
*/

/*
	// 104. 二叉树的最大深度 递归
	public int maxDepth(TreeNode root) {
		return depth(root, 0);
	}

	private int depth(TreeNode node, int depth) {
		return node == null ? depth : Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
	}
*/

/*
	// 226. 翻转二叉树 递归
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode temp = invertTree(root.right);
		root.right = invertTree(root.left);
		root.left = temp;
		return root;
	}
*/

/*
	// 101. 对称二叉树 递归
	public boolean isSymmetric(TreeNode root) {
		return dfs(root.left, root.right);
	}

	private boolean dfs(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null || left.val != right.val) {
			return false;
		}
		return dfs(left.left, right.right) && dfs(left.right, right.left);
	}
*/

/*
	// 543. 二叉树的直径 递归
	private int ans = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		dfs(root);
		return ans;
	}

	private int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = dfs(node.left);
		int right = dfs(node.right);
		ans = Math.max(ans, left + right);
		return Math.max(left, right) + 1;
	}
*/

/*
	// 102. 二叉树的层序遍历 BFS
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if (root != null) {
			ArrayDeque<TreeNode> deque = new ArrayDeque<>();
			deque.offerLast(root);
			while (!deque.isEmpty()) {
				int size = deque.size();
				List<Integer> level = new ArrayList<>();
				while (size-- > 0) {
					TreeNode node = deque.pollFirst();
					level.add(node.val);
					if (node.left != null) {
						deque.offerLast(node.left);
					}
					if (node.right != null) {
						deque.offerLast(node.right);
					}
				}
				ans.add(level);
			}
		}
		return ans;
	}
*/

/*
	// 108. 将有序数组转换为二叉搜索树 二分 递归
	public TreeNode sortedArrayToBST(int[] nums) {
		return dfs(nums, 0, nums.length - 1);
	}

	private TreeNode dfs(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode  node = new TreeNode(nums[mid]);
		node.left = dfs(nums, left, mid - 1);
		node.right = dfs(nums, mid + 1, right);
		return node;
	}
*/

/*
	// 98. 验证二叉搜索树 递归
	private boolean ans = true;
	private long pre = Long.MIN_VALUE;

	public boolean isValidBST(TreeNode root) {
		dfs(root);
		return ans;
	}

	private void dfs(TreeNode node) {
		if (node == null) {
			return;
		}
		dfs(node.left);
		if (!ans || node.val <= pre) {
			ans = false;
			return;
		}
		pre = node.val;
		dfs(node.right);
	}
*/

/*
	// 230. 二叉搜索树中第 K 小的元素 递归
	private int ans = 0;
	private int count = 0;
	public int kthSmallest(TreeNode root, int k) {
		count = k;
		dfs(root);
		return ans;
	}

	private void dfs(TreeNode node) {
		if (node == null || count == 0) {
			return;
		}
		dfs(node.left);
		if (--count == 0) {
			ans = node.val;
			return;
		}
		dfs(node.right);
	}
*/

/*
	// 199. 二叉树的右视图 BFS
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if (root != null) {
			Deque<TreeNode> deque = new ArrayDeque<>();
			deque.offerLast(root);
			while (!deque.isEmpty()) {
				int size = deque.size();
				while (size-- > 0) {
					TreeNode node = deque.pollFirst();
					if (node.left != null) {
						deque.offerLast(node.left);
					}
					if (node.right != null) {
						deque.offerLast(node.right);
					}
					if (size == 0) {
						ans.add(node.val);
					}
				}
			}
		}
		return ans;
	}
*/

/*
	// 114. 二叉树展开为链表 递归

	public void flatten(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode temp = root.right;
		flatten(root.left);
		flatten(root.right);
		root.right = root.left;
		root.left = null;
		while (root.right != null) {
			root = root.right;
		}
		root.right = temp;
	}
*/

/*
	// 105. 从前序与中序遍历序列构造二叉树
	private int[] preorder;
	private Map<Integer, Integer> dic = new HashMap<>();

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		for (int i = 0; i < inorder.length; i++) {
			dic.put(inorder[i], i);
		}
		return recur(0, 0, inorder.length - 1);
	}

	private TreeNode recur(int root, int left, int right) {
		if (left > right) {
			return null;
		}
		TreeNode node = new TreeNode(preorder[root]);
		int num = dic.get(preorder[root]);
		node.left = recur(root + 1, left, num - 1);
		node.right = recur(root + num - left + 1, num + 1, right);
		return node;
	}
*/

	// 437. 路径总和 III

	public class TreeNode {
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

	@Test
	public void test() {
	}
}
