package com.yjj.datastructure.linkedlist;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 15:32
 * @description:
 */
public class TestNode {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.append(new Node(2)).append(new Node(3));
        n1.show();
        n1.removeNext();
        n1.show();
        n1.after(new Node(2));
        n1.show();
    }
}
