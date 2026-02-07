package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/2/6 10:43
 */
public class LinkedListTest {

/*
	// 160. 相交链表 双指针
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode posA = headA;
		ListNode posB = headB;
		while (posA != posB) {
			posA = posA != null ? posA.next : headB;
			posB = posB != null ? posB.next : headA;
		}
		return posA;
	}
*/

/*
	// 206. 反转链表
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}
*/

/*
	// 234. 回文链表
	public boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int n = list.size();
		int l = 0, r = n - 1;
		while (l <= r) {
			if (!list.get(l++).equals(list.get(r--)))
				return false;
		}
		return true;
	}
*/

/*
	// 234. 回文链表
	public boolean isPalindrome(ListNode head) {
		ListNode mid = middleNode(head);
		ListNode head2 = reverseList(mid);
		while (head2 != null) {
			if (head.val != head2.val) { // 不是回文链表
				return false;
			}
			head = head.next;
			head2 = head2.next;
		}
		return true;
	}

	// 链表的中间结点
	private ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	// 反转链表
	private ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode nxt = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nxt;
		}
		return pre;
	}
*/

/*
	// 141. 环形链表 哈希
	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		while (head != null) {
			if (set.contains(head)) {
				return true;
			} else {
				set.add(head);
				head = head.next;
			}
		}
		return false;
	}
*/

/*
	// 141. 环形链表 快慢指针
	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
*/

/*
	// 142. 环形链表 II 快慢指针
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head, slow = head;
		while (true) {
			if (fast == null || fast.next == null) {
				return null;
			}
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				break;
			}
		}
		fast = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
*/

/*
	// 21. 合并两个有序链表 双指针
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode pre = new ListNode(), cur = pre;
		ListNode cur1 = list1, cur2 = list2;
		while (cur1 != null || cur2 != null) {
			if (cur1 == null) {
				cur.next = cur2;
				cur2 = cur2.next;
			} else if (cur2 == null) {
				cur.next = cur1;
				cur1 = cur1.next;
			} else if (cur1.val <= cur2.val) {
				cur.next = cur1;
				cur1 = cur1.next;
			} else {
				cur.next = cur2;
				cur2 = cur2.next;
			}
			cur = cur.next;
		}
		return pre.next;
	}
*/

/*
	// 2. 两数相加 双指针 模拟
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pre = new ListNode(), cur = pre;
		int res = 0;
		while (true) {
			if (l1 == null && l2 == null && res == 0) {
				break;
			}
			int num1 = 0, num2 = 0;
			if (l1 != null) {
				num1 = l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				num2 = l2.val;
				l2 = l2.next;
			}
			int sum = num1 + num2 + res;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			res = sum / 10;
		}
		return pre.next;
	}
*/

/*
	// 19. 删除链表的倒数第 N 个结点
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		ListNode l = dummy, r = dummy;
		while (n-- > 0) {
			r = r.next;
		}
		while (r.next != null) {
			l = l.next;
			r = r.next;
		}
		l.next = l.next.next;
		return dummy.next;
	}
*/

/*
	// 24. 两两交换链表中的节点
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0, head);
		ListNode temp = dummy;
		while (temp.next != null && temp.next.next!=null){
			ListNode node1 = temp.next;
			ListNode node2 = temp.next.next;
			temp.next = node2;
			node1.next = node2.next;
			node2.next = node1;
			temp = node1;
		}
		return dummy.next;
	}
*/

/*
	// 138. 随机链表的复制 哈希
	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}
		Node cur = head;
		HashMap<Node, Node> map = new HashMap<>();
		while (cur != null) {
			map.put(cur, new Node(cur.val));
			cur = cur.next;
		}
		cur = head;
		while (cur != null) {
			map.get(cur).next = map.get(cur.next);
			map.get(cur).random = map.get(cur.random);
			cur = cur.next;
		}
		return map.get(head);
	}
*/

/*
	// 146. LRU 缓存 链表哈希
	class LRUCache {

		private final int capacity;
		private final Map<Integer, Integer> map;

		public LRUCache(int capacity) {
			this.capacity = capacity;
			map = new LinkedHashMap<>();
		}

		public int get(int key) {
			Integer value = map.remove(key);
			if (value != null) {
				map.put(key, value);
				return value;
			}
			return -1;
		}

		public void put(int key, int value) {
			if (map.remove(key) != null) {
				map.put(key, value);
				return;
			}

			if(map.size() == capacity) {
				Integer eldestKey = map.keySet().iterator().next();
				map.remove(eldestKey);
			}
			map.put(key, value);
		}
	}
*/

/*
	// 146. LRU 缓存
	class LRUCache {

		class Node {
			int key, value;
			Node pre, next;

			Node(int k, int v) {
				key = k;
				value = v;
			}
		}

		private final int capacity;
		private final Node dummy;
		private final Map<Integer, Node> keyToNode;

		public LRUCache(int capacity) {
			this.capacity = capacity;
			dummy = new Node(0, 0);
			dummy.pre = dummy;
			dummy.next = dummy;
			keyToNode = new HashMap<>();
		}

		public int get(int key) {
			Node node = getNode(key);
			return node == null ? -1 : node.value;
		}

		public void put(int key, int value) {
			Node node = getNode(key);
			if (node != null) {
				node.value = value;
				return;
			}
			node = new Node(key, value);
			keyToNode.put(key, node);
			pushFront(node);
			if (keyToNode.size() > capacity) {
				Node backNode = dummy.pre;
				keyToNode.remove(backNode.key);
				remove(backNode);
			}
		}

		private Node getNode(int key) {
			if (!keyToNode.containsKey(key)) {
				return null;
			}
			Node node = keyToNode.get(key);
			remove(node);
			pushFront(node);
			return node;
		}

		private void remove (Node temp) {
			temp.pre.next = temp.next;
			temp.next.pre = temp.pre;
		}

		private void pushFront(Node temp) {
			Node dummyNext = dummy.next;
			temp.next = dummyNext;
			temp.pre = dummy;
			dummyNext.pre = temp;
			dummy.next = temp;
		}
	}
*/

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
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

	@Test
	public void test() {
	}
}
