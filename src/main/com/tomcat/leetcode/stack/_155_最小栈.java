package main.com.tomcat.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack/
 * Create by yuzhangbin on 2020/9/22
 */
public class _155_最小栈 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public void push(int x) {
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {

    }

//    public int top() {
//
//    }

//    public int getMin() {
//
//    }
}
