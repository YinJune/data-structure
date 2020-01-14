package com.yjj.datastructure.stack;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 14:25
 * @description: 后进先出 数组
 */
public class MyStack {
    //底层使用数组存储数据
    private int[] elements;

    public MyStack() {
        this.elements = new int[0];
    }

    //压入元素
    public void push(int element) {
        //往数组末尾添加一个元素
        //创建一个新数组
        int[] newArr = new int[elements.length + 1];
        //复制
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把元素放入新数组中
        newArr[newArr.length - 1] = element;
        //替换
        elements = newArr;
    }

    //取出栈顶元素 并把它剔除
    public int pop() {
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        int element = elements[elements.length - 1];
        //创建一个新的数组 长度-1
        int[] newArr = new int[elements.length - 1];
        //把原数组中数据考到新数组 除了最后一个
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    //查看栈顶元素 只是看一下
    public int peek(){
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

    public boolean isEmpty(){
        return elements.length==0;
    }
}
