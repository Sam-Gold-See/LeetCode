package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class StackTest {

/*
    // 2390 从字符串中移除星号 栈
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray())
            if(c == '*')
                stack.pop();
            else
                stack.push(c);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
*/

/*
    // 2309 从字符串中移除星号 数组栈优化
    public String removeStars(String s) {
        int len = s.length();
        char[] ch = new char[len];
        int top = 0;
        for (int i = 0; i < len; i++)
            if (s.charAt(i) == '*')
                top--;
            else
                ch[top++] = s.charAt(i);
        return new String(ch, 0, top);
    }
*/

/*
    // 735 小行星碰撞 栈模拟
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int top = 0;
        while (top < asteroids.length) {
            if (stack.empty() || stack.peek() < 0 || asteroids[top] > 0)
                stack.push(asteroids[top]);
            else if (stack.peek() <= -asteroids[top])
                if (stack.pop() < -asteroids[top])
                    continue;
            top++;
        }
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--)
            res[i] = stack.pop();
        return res;
    }
*/

/*
    // 294 字符串解码 栈
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int num = 0;
        String curString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c))
                num = num * 10 + c - '0';
            else if (c == '['){
                numStack.push(num);
                stringStack.push(curString);
                num = 0;
                curString = "";
            }else if(c== ']'){
                int times = numStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for(int j= 0;j<times;j++)
                    temp.append(curString);
                curString = temp.toString();
            }else {
                curString += c;
            }
        }
        return curString;
    }
*/

    @Test
    public void test() {
    }
}
