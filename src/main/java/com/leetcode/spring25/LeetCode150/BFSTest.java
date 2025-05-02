package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.*;

public class BFSTest {

/*
    // 433 最小基因变化 BFS
    private static final char[] items = new char[]{'A', 'C', 'G', 'T'};

    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, bank);
        Deque<String> d = new ArrayDeque<>();
        Map<String, Integer> map = new HashMap<>();
        d.addLast(startGene);
        map.put(startGene, 0);
        while (!d.isEmpty()) {
            int size = d.size();
            while (size-- > 0) {
                String s = d.pollFirst();
                char[] cs = s.toCharArray();
                int step = map.get(s);
                for (int i = 0; i < 8; i++) {
                    for (char c : items) {
                        if (cs[i] == c)
                            continue;
                        char[] clone = cs.clone();
                        clone[i] = c;
                        String sub = String.valueOf(clone);
                        if (!set.contains(sub))
                            continue;
                        if (map.containsKey(sub))
                            continue;
                        if (sub.equals(endGene))
                            return step + 1;
                        map.put(sub, step + 1);
                        d.addLast(sub);
                    }
                }
            }
        }
        return -1;
    }
*/

    @Test
    public void test() {
    }
}
