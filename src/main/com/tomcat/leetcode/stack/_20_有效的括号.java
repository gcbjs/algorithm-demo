package main.com.tomcat.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 * Create by yuzhangbin on 2020/9/22
 */
public class _20_有效的括号 {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            }else if (c == '[') {
                stack.push(']');
            }else if (c == '(') {
                stack.push(')');
            }else if (stack.isEmpty() || c!= stack.pop()) {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
