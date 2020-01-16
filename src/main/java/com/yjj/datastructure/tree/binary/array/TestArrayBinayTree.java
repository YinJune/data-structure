package com.yjj.datastructure.tree.binary.array;

/**
 * @author: YinJunJie
 * @date: 2020/1/16 16:37
 * @description:
 */
public class TestArrayBinayTree {
    public static void main(String[] args) {
        int[] data=new int[]{1,2,3,4,5,6,7};
        ArrayBinaryTree arrayBinaryTree=new ArrayBinaryTree(data);
        arrayBinaryTree.preOrderTraversal();
    }
}
