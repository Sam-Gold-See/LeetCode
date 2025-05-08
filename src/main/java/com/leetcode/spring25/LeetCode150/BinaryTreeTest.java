package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.*;

public class BinaryTreeTest {

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

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
    // 104 二叉树的最大深度 二叉树 DFS
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    private int depth(TreeNode node, int depth) {
        return node == null ? depth : Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
    }
*/

/*
    // 101 对称二叉树 二叉树 DFS
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null || left.val != right.val)
            return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
*/

/*
    // 226 翻转二叉树 二叉树 DFS
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode t = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = t;
        return root;
    }
*/

/*
    // 100 相同的树 二叉树 DFS
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
*/

/*
    // 105 从前序与中序遍历序列构造二叉树 二叉树 分治
    private int[] preorder;
    Map<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++)
            dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }

    private TreeNode recur(int root, int left, int right) {
        if (left > right)
            return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;
    }
*/

/*
    // 106 从中序与后序遍历序列构造二叉树 二叉树 分治
    private int[] postorder;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return dfs(0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode dfs(int inL, int inR, int postL, int postR) {
        if (inL > inR || postL > postR)
            return null;

        int val = postorder[postR];
        int idx = map.get(val);

        TreeNode node = new TreeNode(val);
        node.left = dfs(inL, idx - 1, postL, postL + idx - inL - 1);
        node.right = dfs(idx + 1, inR, postL + idx - inL, postR - 1);
        return node;
    }
*/

/*
    // 117 填充每个节点的下一个右侧节点指针 II 二叉树 BFS
    public Node connect(Node root) {
        Node pre = null;
        if (root != null) {
            Deque<Node> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size-- > 0) {
                    Node node = queue.poll();
                    if (pre != null)
                        pre.next = node;
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                    pre = node;
                }
                pre = null;
            }
        }
        return root;
    }
*/

/*
    // 114 二叉树展开为链表 二叉树 递归
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        TreeNode temp = root.right;
        flatten(root.left);
        flatten(root.right);
        root.right = root.left;
        root.left = null;
        while(root.right != null)
            root = root.right;
        root.right = temp;
    }
*/

/*
    // 112 路径总和 二叉树 递归
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return sum == root.val;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
*/

/*
    // 129 求根节点到叶节点数字之和 二叉树 递归
    private int ans = 0;

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode node, int num) {
        int temp = num * 10 + node.val;
        if (node.left == null && node.right == null)
            ans += temp;
        if (node.left != null)
            dfs(node.left, temp);
        if (node.right != null)
            dfs(node.right, temp);
    }
*/

/*
    // 173 二叉搜索树迭代器 二叉树 递归
    class BSTIterator {

        List<Integer> list;
        int pos;

        public BSTIterator(TreeNode root) {
            list = new ArrayList<>();
            init(root);
            pos = 0;
        }

        private void init(TreeNode node) {
            if (node == null)
                return;
            init(node.left);
            list.add(node.val);
            init(node.right);
        }

        public int next() {
            return list.get(pos++);
        }

        public boolean hasNext() {
            return pos < list.size();
        }
    }
*/

/*
    // 173 二叉搜索树迭代器 二叉树 栈
    class BSTIterator {

        private TreeNode cur;
        private Deque<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            cur = root;
            stack = new LinkedList<>();
        }

        public int next() {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.poll();
            int ret = cur.val;
            cur = cur.right;
            return ret;
        }

        public boolean hasNext() {
            return cur != null || !stack.isEmpty();
        }
    }
*/

/*
    // 222 完全二叉树的节点个数 二叉树 DFS
    private int ans = 0;

    public int countNodes(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        dfs(node.left);
        ans++;
        dfs(node.right);
    }
*/

/*
    // 236 二叉树的最近公共祖先 二叉树 递归
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null)
            return right;
        if (right == null)
            return left;
        return root;
    }
*/

/*
    // 199 二叉树的右视图 二叉树 BFS
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
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
                        list.add(node.val);
                }
            }
        }
        return list;
    }
*/

/*
    // 637 二叉树的层平均值 二叉树 BFS
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            list.add(sum / size);
        }
        return list;
    }
*/

/*
    // 102 二叉树的层序遍历 二叉树 BFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> temp = new ArrayList<>();
                while (size-- > 0) {
                    TreeNode node = queue.poll();
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                    temp.add(node.val);
                }
                list.add(temp);
            }
        }
        return list;
    }
*/

/*
    // 103 二叉树的锯齿形层序遍历 二叉树 BFS
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                LinkedList<Integer> list = new LinkedList<>();
                while (size-- > 0) {
                    TreeNode node = queue.poll();
                    if(ans.size()%2 ==0)
                        list.offerLast(node.val);
                    else
                        list.offerFirst(node.val);
                    if (node.left != null)
                        queue.offer(node.left);
                    if (node.right != null)
                        queue.offer(node.right);
                }
                ans.add(list);
            }
        }
        return ans;
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

/*
    // 783 二叉搜索树节点最小距离 二叉树 DFS
    private int ans = Integer.MAX_VALUE;
    private int pre = -1;

    public int minDiffInBST(TreeNode root) {
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

/*
    // 230 二叉搜索树中第K小的元素 二叉树
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        while (root != null || !queue.isEmpty()) {
            while (root != null) {
                queue.offer(root);
                root = root.left;
            }
            root = queue.pollLast();
            if (--k == 0)
                break;
            root = root.right;
        }
        return root.val;
    }
*/

/*
    // 98 验证二叉搜索树 二叉树 DFS
    private boolean ans = true;
    private long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        dfs(node.left);
        if (!ans || node.val <= pre) {
            ans = false;
            return;
        }
        pre = node.val;
        dfs(node.right);
    }
*/

    @Test
    public void test() {
    }
}
