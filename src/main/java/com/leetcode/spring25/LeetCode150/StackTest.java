package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.*;

public class StackTest {

/*
    // 20 有效的括号 栈
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

        for (char c : chars)
            if (left[c] != 0)
                stack.push(c);
            else if (stack.isEmpty() || stack.pop() != right[c])
                return false;
        return stack.isEmpty();
    }
*/

/*
    // 71 简化路径 栈
    public String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        for (String item : path.split("/")) {
            if (item.equals("..")) {
                if (!deque.isEmpty())
                    deque.pop();
            } else if (!item.isEmpty() && !item.equals("."))
                deque.push(item);
        }
        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty())
            sb.append("/").append(deque.pollLast());
        return sb.isEmpty() ? "/" : sb.toString();
    }
*/

/*
    // 155 最小栈 栈
    class MinStack {

        private Stack<Integer> numStack;
        private Stack<Integer> minStack;

        public MinStack() {
            numStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            numStack.push(val);
            if (minStack.isEmpty() || minStack.peek() >= val)
                minStack.push(val);
        }

        public void pop() {
            if (Objects.equals(numStack.pop(), minStack.peek()))
                minStack.pop();
        }

        public int top() {
            return numStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
*/

/*
    // 150 逆波兰表达式求值 栈
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer op1, op2;
        for (String token : tokens) {
            if (token.equals("+")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 + op2);
            } else if (token.equals("-")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 - op2);
            } else if (token.equals("*")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 * op2);
            } else if (token.equals("/")) {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 / op2);
            } else
                stack.push(Integer.valueOf(token));
        }
        return stack.pop();
    }
*/

    @Test
    public void test() {
    }
}
