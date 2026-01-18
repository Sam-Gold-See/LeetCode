package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/1/28 10:07
 */
public class BinaryTreeTest {

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
	// 872. 叶子相似的树 DFS
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<>();
		if (root1 != null) {
			dfs(root1, list1);
		}

		List<Integer> list2 = new ArrayList<>();
		if (root2 != null) {
			dfs(root2, list2);
		}

		return list1.equals(list2);
	}

	private void dfs(TreeNode node, List<Integer> list) {
		if (node.left == null && node.right == null) {
			list.add(node.val);
		} else {
			if (node.left != null) {
				dfs(node.left, list);
			}
			if (node.right != null) {
				dfs(node.right, list);
			}
		}
	}
*/

/*
	// 1448. 统计二叉树中好节点的数目 DFS
	public int goodNodes(TreeNode root) {
		return dfs(root, root.val);
	}

	private int dfs(TreeNode node, int max) {
		if (node == null) {
			return 0;
		}
		int left = dfs(node.left, Math.max(max, node.val));
		int right = dfs(node.right, Math.max(max, node.val));
		return left + right + (max <= node.val ? 1 : 0);
	}
*/

/*
	// 437. 路径总和 III DFS 前缀和
	private Map<Long, Integer> prefix;
	private int target;

	public int pathSum(TreeNode root, int targetSum) {
		prefix = new HashMap<>();
		target = targetSum;

		prefix.put(0L, 1);
		return dfs(root, 0L);
	}

	private int dfs(TreeNode node, long curSum) {
		if (node == null) {
			return 0;
		}

		int ans = 0;
		curSum += node.val;

		ans = prefix.getOrDefault(curSum - target, 0);
		prefix.put(curSum, prefix.getOrDefault(curSum, 0) + 1);

		int left = dfs(node.left, curSum);
		int right = dfs(node.right, curSum);

		prefix.put(curSum, prefix.get(curSum) - 1);
		ans += left + right;
		return ans;
	}
*/

/*
	// 1372. 二叉树中的最长交错路径 DFS
	private int mx = 0;

	public int longestZigZag(TreeNode root) {
		if (root == null) {
			return 0;
		}
		dfs(root, 0, false);
		dfs(root, 0, true);
		return mx;
	}

	private void dfs(TreeNode node, int len, boolean dir) {
		mx = Math.max(mx, len);
		if (!dir) {
			if (node.left != null) {
				dfs(node.left, len + 1, true);
			}
			if (node.right != null) {
				dfs(node.right, 1, false);
			}
		} else {
			if (node.left != null) {
				dfs(node.left, 1, true);
			}
			if (node.right != null) {
				dfs(node.right, len + 1, false);
			}
		}
	}
*/

/*
	// 236. 二叉树的最近公共祖先 递归
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left , p , q);
		TreeNode right = lowestCommonAncestor(root.right, p , q);
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}
		return root;
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
	// 1161. 最大层内元素和 BFS
	public int maxLevelSum(TreeNode root) {
		int maxSum = Integer.MIN_VALUE, ans = 0, pos = 0;
		Deque<TreeNode> deque = new ArrayDeque<>();
		deque.offerLast(root);
		while (!deque.isEmpty()) {
			int size = deque.size();
			int sum = 0;
			pos++;
			while (size-- > 0) {
				TreeNode node = deque.pollFirst();
				sum += node.val;
				if (node.left != null) {
					deque.offerLast(node.left);
				}
				if (node.right != null) {
					deque.offerLast(node.right);
				}
			}
			if (sum > maxSum) {
				ans = pos;
				maxSum = sum;
			}
		}
		return ans;
	}
*/

/*
	// 700. 二叉搜索树中的搜索 DFS
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null || root.val == val) {
			return root;
		}
		return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
	}
*/

/*
	// 450. 删除二叉搜索树中的节点 DFS
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (root.val == key) {
			if (root.right == null) {
				return root.left;
			}
			if (root.left == null) {
				return root.right;
			}
			TreeNode node = root.left;
			while (node.right != null) {
				node = node.right;
			}
			node.right = root.right;
			return root.left;
		} else if (root.val < key) {
			root.right = deleteNode(root.right, key);
		} else {
			root.left = deleteNode(root.left, key);
		}
		return root;
	}
*/

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	@Test
	public void test() {
	}
}
