package com.yjj.datastructure.tree.binary.array;

/**
 * @author: YinJunJie
 * @date: 2020/1/16 16:29
 * @description:
 */
public class ArrayBinaryTree {
    //根节点索引为0，
    // 第n个节点的左子节点是：2*n+1
    // 第n个节点的右子节点是：2*n+2
    // 第n个节点的父节点是：(n-1)/2
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }


    public void preOrderTraversal() {
        preOrderTraversal(0);
    }

    //前序遍历
    private void preOrderTraversal(int start) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前节点
        System.out.print(data[start] + " ");
        //左子树
        if (2 * start + 1 < data.length) {
            preOrderTraversal(2 * start + 1);
        }
        //柚子树
        if (2 * start + 2 < data.length) {
            preOrderTraversal(2 * start + 2);
        }
    }
}
