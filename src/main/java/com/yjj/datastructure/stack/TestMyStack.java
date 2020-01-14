package com.yjj.datastructure.stack;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 14:31
 * @description:
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
    }
}
