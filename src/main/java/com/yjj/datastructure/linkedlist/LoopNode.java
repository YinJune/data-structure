package com.yjj.datastructure.linkedlist;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 14:43
 * @description:
 */
public class LoopNode {
    //节点内容 (数据域)
    private int data;
    //下一个节点 (指针域)
    private LoopNode next=this;

    public LoopNode(int data) {
        this.data = data;
    }


    //删除下一个节点
    public void removeNext(){
        if (this.next==null){
            throw new RuntimeException("current node is last node");
        }
        this.next=this.next.next;
    }

    public LoopNode next() {
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    //在当前节点之后插入一个新节点
    public void after(LoopNode node){
        //取出下一个节点，作为下下一个节点
        node.next=this.next;
        this.next=node;
    }
}
