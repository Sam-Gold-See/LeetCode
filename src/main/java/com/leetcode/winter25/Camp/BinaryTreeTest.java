package com.leetcode.winter25.Camp;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/3/26 09:29
 */
public class BinaryTreeTest {

/*
	// 144. 二叉树的前序遍历
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		dfs(root, ans);
		return ans;
	}

	private void dfs(TreeNode node, List<Integer> ans) {
		if (node == null) {
			return;
		}

		ans.add(node.val);

		dfs(node.left, ans);

		dfs(node.right, ans);
	}
*/

/*
	// 102. 二叉树的层序遍历
	public List<List<Integer>> levelOrder(TreeNode root) {
		Deque<TreeNode> deque = new ArrayDeque<>();
		List<List<Integer>> ans = new ArrayList<>();
		if (root != null) {
			deque.offerLast(root);
			while (!deque.isEmpty()) {
				int size = deque.size();
				List<Integer> temp = new ArrayList<>();
				while (size-- > 0) {
					TreeNode node = deque.pollFirst();
					if (node.left != null) {
						deque.offerLast(node.left);
					}
					if (node.right != null) {
						deque.offerLast(node.right);
					}
					temp.addLast(node.val);
				}
				ans.add(temp);
			}
		}
		return ans;
	}
*/

/*
	// 226. 翻转二叉树
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
	// 101. 对称二叉树
	public boolean isSymmetric(TreeNode root) {
		return dfs(root.left, root.right);
	}

	private boolean dfs(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null || right== null || left.val != right.val) {
			return false;
		}
		return dfs(left.left, right.right) && dfs(left.right, right.left);
	}
*/

/*
	// 104. 二叉树的最大深度
	public int maxDepth(TreeNode root) {
		return depth(root, 0);
	}

	private int depth(TreeNode node, int depth) {
		return node == null ? depth : Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
	}
*/


/*
	// 111. 二叉树的最小深度
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		int minDepth = Integer.MAX_VALUE;
		if (root.left != null) {
			minDepth = Math.min(minDepth(root.left), minDepth);
		}
		if (root.right != null) {
			minDepth = Math.min(minDepth(root.right), minDepth);
		}

		return minDepth + 1;
	}
*/

/*
	// 222. 完全二叉树的节点个数
	private int ans = 0;

	public int countNodes(TreeNode root) {
		dfs(root);
		return ans;
	}

	private void dfs(TreeNode node) {
		if (node == null) {
			return;
		}
		dfs(node.left);
		ans++;
		dfs(node.right);
	}
*/

/*
	// 110. 平衡二叉树
	private boolean ans = true;

	public boolean isBalanced(TreeNode root) {
		dfs(root);
		return ans;
	}

	private int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = dfs(node.left) + 1;
		int right = dfs(node.right) + 1;
		if (Math.abs(right - left) > 1) {
			ans = false;
		}
		return Math.max(left, right);
	}
*/

/*
	// 257. 二叉树的所有路径
	private StringBuilder sb;
	private List<String> ans;

	public List<String> binaryTreePaths(TreeNode root) {
		sb = new StringBuilder();
		ans = new ArrayList<>();
		dfs(root);
		return ans;
	}

	private void dfs(TreeNode node) {
		if (node == null) {
			return;
		}

		int len = sb.length();
		sb.append(node.val);
		if (node.left == null && node.right == null) {
			ans.addLast(new String(sb));
		} else {
			sb.append("->");
			dfs(node.left);
			dfs(node.right);
		}
		sb.setLength(len);
	}
*/

/*
	// 404. 左叶子之和
	public int sumOfLeftLeaves(TreeNode root) {
		return root!= null? dfs (root) : 0;
	}

	private int dfs(TreeNode node) {
		int ans = 0;
		if (node.left != null) {
			ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
		}
		if (node.right != null) {
			ans += dfs(node.right);
		}
		return ans;
	}

	private boolean isLeafNode(TreeNode node) {
		return node.left == null && node.right == null;
	}
*/

/*
	// 513. 找树左下角的值
	public int findBottomLeftValue(TreeNode root) {
		int ans = 0;
		Deque<TreeNode> deque = new ArrayDeque<>();
		deque.offerLast(root);
		while (!deque.isEmpty()) {
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = deque.pollFirst();
				if (i == 0) {
					ans = node.val;
				}
				if (node.left != null) {
					deque.offerLast(node.left);
				}
				if (node.right != null) {
					deque.offerLast(node.right);
				}
			}
		}
		return ans;
	}
*/

/*
	// 112. 路径总和
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null) {
			return targetSum == root.val;
		}
		return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
	}
*/

	@Test
	public void test() {

	}

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

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
