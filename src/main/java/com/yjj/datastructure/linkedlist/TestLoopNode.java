package com.yjj.datastructure.linkedlist;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 16:41
 * @description:
 */
public class TestLoopNode {
    public static void main(String[] args) {
        LoopNode l1=new LoopNode(1);
        LoopNode l2=new LoopNode(2);
        LoopNode l3=new LoopNode(3);
        LoopNode l4=new LoopNode(4);
        l1.after(l2);
        l2.after(l3);
        l3.after(l4);
        System.out.println(l4.next().getData());
    }
}
