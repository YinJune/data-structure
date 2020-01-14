package com.yjj.datastructure.linkedlist;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 14:43
 * @description:
 */
public class Node {
    //节点内容 (数据域)
    private int data;
    //下一个节点 (指针域)
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            Node nextNode = currentNode.next;
            //下一个节点为null表示是最后一个节点
            if (nextNode == null) {
                break;
            }
            //依次往后找
            currentNode = nextNode;
        }
        //currentNode为最后一个节点
        currentNode.next = node;
        return this;
    }

    //删除下一个节点
    public void removeNext(){
        if (this.next==null){
            throw new RuntimeException("current node is last node");
        }
        this.next=this.next.next;
    }

    public Node next() {
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public boolean isLast(){
        return this.next==null;
    }
    public void show(){
        Node currentNode=this;
        while (currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
            if (currentNode==null){
                break;
            }
        }
        System.out.println();
    }
    //在当前节点之后插入一个新节点
    public void after(Node node){
        //取出下一个节点，作为下下一个节点
        node.next=this.next;
        this.next=node;
    }
}
