package com.yjj.datastructure.tree.binary.linked;

/**
 * @author: YinJunJie
 * @date: 2020/1/16 13:57
 * @description:
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree=new BinaryTree();
        //创建根节点
        TreeNode root=new TreeNode(1);
        //设置根节点
        binaryTree.setRoot(root);
        //设置左右儿子
        TreeNode rootL=new TreeNode(2);
        TreeNode rootR=new TreeNode(3);
        root.setLeftChild(rootL);
        root.setRightChild(rootR);
        //----------------遍历--------------
        //为第二层节点创建儿子
        rootL.setLeftChild(new TreeNode(4));
        rootL.setRightChild(new TreeNode(5));
        rootR.setLeftChild(new TreeNode(6));
        rootR.setRightChild(new TreeNode(7));

        //前序遍历
        binaryTree.preOrderTraversal();
        //中序遍历
        binaryTree.inorderTraversal();
        //后序遍历
        binaryTree.postOrderTraversal();

        //--------查找--------
        TreeNode result=binaryTree.preOrderSearch(9);
        if (result!=null){
            System.out.println(result.getValue());
        }

        //--------删除--------
        binaryTree.delete(2);
        binaryTree.preOrderTraversal();
    }
}
