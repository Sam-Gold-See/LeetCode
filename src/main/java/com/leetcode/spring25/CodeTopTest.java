package com.leetcode.spring25;

import org.junit.Test;

public class CodeTopTest {

    public static class ListNode {
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

/*
    // 3 无重复字符的最长子串 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0, r = 0;
        char[] dir = new char[128];
        while (r < s.length()) {
            char pos = s.charAt(r);
            dir[pos]++;
            while (dir[pos] > 1)
                dir[s.charAt(l++)]--;
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
*/

/*
    // 146 LRU 缓存 LinkedHashMap
    class LRUCache {

        private final int capacity;
        private final Map<Integer, Integer> table = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            Integer value = table.remove(key);
            if (value != null) {
                table.put(key, value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(table.remove(key) != null){
                table.put(key, value);
                return;
            }

            if(table.size() == capacity){
                Integer eldestKey = table.keySet().iterator().next();
                table.remove(eldestKey);
            }
            table.put(key, value);
        }
    }
*/

/*
    // 146 LRU 缓存 哈希 双向链表
    class LRUCache {

        private static class Node {
            int key, value;
            Node prev, next;

            Node(int k, int v) {
                key = k;
                value = v;
            }
        }

        private final int capacity;
        private final Node dummy = new Node(0, 0);
        private final Map<Integer, Node> keyToNode = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            dummy.prev = dummy;
            dummy.next = dummy;
        }

        private Node getNode(int key) {
            if (!keyToNode.containsKey(key))
                return null;
            Node node = keyToNode.get(key);
            remove(node);
            pushFront(node);
            return node;
        }

        private void remove(Node temp) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        private void pushFront(Node temp) {
            Node dummyNext = dummy.next;
            temp.next = dummyNext;
            temp.prev = dummy;
            dummyNext.prev = temp;
            dummy.next = temp;
        }

        public int get(int key) {
            Node node = getNode(key);
            return node != null ? node.value : -1;
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
            if(keyToNode.size() > capacity){
                Node backNode = dummy.prev;
                keyToNode.remove(backNode.key);
                remove(backNode);
            }
        }
    }
*/

/*
    // 206 反转链表 链表
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
*/

/*
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for (int num : nums)
            pq.add(num);
        while (--k != 0)
            pq.poll();
        return pq.poll();
    }
*/

/*
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            if(pq.size()< k)
                pq.offer(num);
            else{
                Integer topNum = pq.peek();
                if(num > topNum){
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
        return pq.peek();
    }
*/

/*
    // 15 三数之和 双指针
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 3) return ans;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, k = len - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(List.of(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    while (j < k && nums[k] == nums[k - 1])
                        k--;
                    j++;
                    k--;
                } else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return ans;
    }
*/

/*
    // 53 最大子数组和 贪心
    public int maxSubArray(int[] nums) {
        int sum = 0, ans = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            ans = Math.max(sum, ans);
            sum = Math.max(sum, 0);
        }
        return ans;
    }
*/

/*
    // 21 合并两个有序链表 链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(), cur = dummy;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                cur.next = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                cur.next = list1;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
*/

/*
    // 912 排序数组 快排
    // 当子数组长度 <= 7 时，使用插入排序
    private static final int INSERTION_SORT_THRESHOLD = 7;
    private static final Random RANDOM = new Random();

    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        int length = right - left + 1;
        // 如果子区间长度小于等于阈值，用插入排序
        if (length <= INSERTION_SORT_THRESHOLD) {
            insertionSort(nums, left, right);
            return;
        }

        // 随机选一个枢轴，交换到 right 位置
        int randIdx = left + RANDOM.nextInt(length); // [left, right]
        swap(nums, randIdx, right);

        // 按分区法做划分
        int pivotIndex = partition(nums, left, right);

        // 递归左右子区间
        quickSort(nums, left, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, right);
    }

    // 分区：以 nums[right] 作为枢轴，把小于等于枢轴的都移到左边,最后把枢轴放到 i+1 的位置，返回枢轴的新索引
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++)
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        swap(nums, i + 1, right);
        return i + 1;
    }

    // 插入排序：将 [left.right] 范围内的元素进行就地排序
    private void insertionSort(int[] nums, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int current = nums[i];
            int j = i - 1;
            // 从后向前，把比 current 大的都往右移
            while (j >= left && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }

    // 交换两个位置的元素
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
*/

/*
    // 102 二叉树的层序遍历 BFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> deque = new ArrayDeque<>();
            deque.offer(root);
            while (!deque.isEmpty()) {
                int size = deque.size();
                List<Integer> temp = new ArrayList<>();
                while (size-- > 0) {
                    TreeNode node = deque.poll();
                    if (node.left != null)
                        deque.offer(node.left);
                    if (node.right != null)
                        deque.offer(node.right);
                    temp.add(node.val);
                }
                ans.add(temp);
            }
        }
        return ans;
    }
*/

/*
    // 1 两数之和 哈希
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
*/

/*
    // 33 搜索旋转排序数组 二分
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 1) return nums[0] == target ? 0 : -1;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[0]) {
                if (nums[0] <= target && target < nums[mid]) r = mid - 1;
                else l = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[len - 1]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
*/

    @Test
    public void test() {
    }
}
