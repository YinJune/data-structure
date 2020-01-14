package com.yjj.datastructure.linkedlist;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 16:43
 * @description: 双向链表
 */
public class DoubleNode {
    //前节点
    private DoubleNode pre=this;
    private int data;
    //后节点
    private DoubleNode next=this;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void after(DoubleNode node){
        DoubleNode nextNode=this.next;
        //新节点作为当前节点的下一个节点
        this.next=node;
        //把当前节点作为新节点的前节点
        node.pre=this;
        //把原来的下一个节点当做新节点的下一个节点
        node.next=nextNode;
        //让原来的下一个节点的上一个节点为新节点
        nextNode.pre=node;
    }

    //下一个节点
    public DoubleNode next(){
        return this.next;
    }

    //上一个节点
    public DoubleNode pre(){
        return this.pre;
    }

    public int getData(){
        return this.data;
    }
}
