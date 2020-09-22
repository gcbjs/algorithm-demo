package main.com.tomcat.数据结构.栈;

import java.util.Stack;

/**
 * Create by yuzhangbin on 2020/9/22
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.search(2));
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
