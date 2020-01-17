package com.yjj.datastructure.tree.binary.sort;

/**
 * @author: YinJunJie
 * @date: 2020/1/17 14:20
 * @description:
 */
public class TestBinarySearchTree {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 5, 1, 9};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < arr.length; i++) {
            binarySearchTree.add(new TreeNode(arr[i]));
        }
        binarySearchTree.inOrderTraversal();
        //查找
        TreeNode node=binarySearchTree.search(5);
        System.out.println(node);
        //删除
        binarySearchTree.delete(5);
        TreeNode parent=binarySearchTree.searchParentNode(12);
        System.out.println(parent.value);
    }
}
