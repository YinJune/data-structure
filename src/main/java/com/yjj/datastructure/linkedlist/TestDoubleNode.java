package com.yjj.datastructure.linkedlist;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 17:44
 * @description:
 */
public class TestDoubleNode {
    public static void main(String[] args) {
        DoubleNode n1=new DoubleNode(1);
        DoubleNode n2=new DoubleNode(2);
        DoubleNode n3=new DoubleNode(3);

        n1.after(n2);
        n2.after(n3);
        System.out.println(n3.next().getData());
        System.out.println(n1.pre().getData());
    }
}
