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

/*
	// 106. 从中序与后续遍历序列构造二叉树
	private Map<Integer, Integer> map = new HashMap<>();
	private int[] postorder;

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		this.postorder = postorder;
		return build(0, inorder.length - 1, 0, postorder.length - 1);
	}

	private TreeNode build(int inL, int inR, int postL, int postR) {
		if (inL > inR || postL > postR) {
			return null;
		}

		int val = postorder[postR];
		int idx = map.get(val);

		TreeNode node = new TreeNode(val);
		node.left = build(inL, idx - 1, postL, postL + idx - inL - 1);
		node.right = build(idx + 1, inR, postL + idx - inL, postR - 1);
		return node;
	}
*/


/*
	// 654. 最大二叉树
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return build(nums, 0, nums.length - 1);
	}

	private TreeNode build(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int best = left;
		for (int i = left + 1; i <= right; i++) {
			if (nums[i] > nums[best]) {
				best = i;
			}
		}
		TreeNode node = new TreeNode(nums[best]);
		node.left = build(nums, left, best - 1);
		node.right = build(nums, best + 1, right);
		return node;
	}
*/

/*
	// 617. 合并二叉树
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return root1 == null ? root2 : root1;
		}
		return build(root1, root2);
	}

	private TreeNode build(TreeNode node1, TreeNode node2) {
		if (node1 == null || node2 == null) {
			return node1 == null ? node2 : node1;
		}
		node1.val += node2.val;
		node1.left = build(node1.left, node2.left);
		node1.right = build(node1.right, node2.right);
		return node1;
	}
*/

/*
	// 700. 二叉搜索树中的搜索
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null || root.val == val) {
			return root;
		}
		return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
	}
*/

/*
	// 98 验证二叉搜索树
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public boolean isValidBST(TreeNode node, long lower, long upper) {
		if (node == null) {
			return true;
		}
		if (node.val <= lower || node.val >= upper) {
			return false;
		}
		return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
	}
*/

/*
	// 530 二叉搜索树的最小绝对差 二叉树 DFS
	private int ans = Integer.MAX_VALUE;
	private int pre = -1;

	public int getMinimumDifference(TreeNode root) {
		dfs(root);
		return ans;
	}

	private void dfs(TreeNode node) {
		if (node == null)
			return;
		dfs(node.left);
		if (pre != -1)
			ans = Math.min(ans, node.val - pre);
		pre = node.val;
		dfs(node.right);
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
