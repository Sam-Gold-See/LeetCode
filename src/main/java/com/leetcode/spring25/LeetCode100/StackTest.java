package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Stack;

public class StackTest {

/*
    // 20 有效的括号 栈 模拟
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char[] left = new char[128];
        char[] right = new char[128];
        left['('] = ')';
        right[')'] = '(';
        left['{'] = '}';
        right['}'] = '{';
        left['['] = ']';
        right[']'] = '[';
        for (char c : chars) {
            if (left[c] != 0)
                stack.push(c);
            else if (stack.isEmpty() || stack.pop() != right[c])
                return false;
        }
        return stack.isEmpty();
    }
*/

    @Test
    public void test() {
    }
}
