package com.yjj.datastructure.tree.binary.linked;

/**
 * @author: YinJunJie
 * @date: 2020/1/16 14:25
 * @description:
 */
public class TreeNode {
    //左儿子
    private TreeNode leftChild;
    //节点的权
    private int value;
    //右儿子
    private TreeNode rightChild;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    //设置左儿子
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    //设置右儿子
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void preOrderTraversal() {
        //先遍历根节点
        System.out.print(value + " ");
        //然后左节点
        if (leftChild != null) {
            leftChild.preOrderTraversal();
        }
        //然后又节点
        if (rightChild != null) {
            rightChild.preOrderTraversal();
        }
    }

    /**
     * 中序遍历
     */
    public void inorderTraversal() {
        if (leftChild != null) {
            //遍历左子树
            leftChild.inorderTraversal();
        }
        //访问根节点
        System.out.print(value + " ");
        if (rightChild != null) {
            //遍历右字数
            rightChild.inorderTraversal();
        }
    }

    /**
     * 后序遍历
     */
    public void postOrderTraversal() {
        if (leftChild != null) {
            //遍历左子树
            leftChild.postOrderTraversal();
        }
        //遍历右字数
        if (rightChild != null) {
            rightChild.postOrderTraversal();
            //访问根节点
        }
        System.out.print(value + " ");
    }

    /**
     * 前序查找
     *
     * @param target
     * @return
     */
    public TreeNode preOrderSearch(int target) {
        TreeNode targetNode = null;
        //对比当前节点的值
        if (value == target) {
            return this;
        }
        //查找左儿子
        if (leftChild != null) {
            targetNode = leftChild.preOrderSearch(target);
        }
        //找到了就返回
        if (targetNode != null) {
            return targetNode;
        }
        //查找右儿子
        if (rightChild != null) {
            targetNode = rightChild.preOrderSearch(target);
        }
        if (targetNode != null) {
            return targetNode;
        }
        return null;
    }

    /**
     * 删除节点 （整棵树全删掉包括子节点）
     *
     * @param target
     */
    public void delete(int target) {
        //删除的方法是让它的父节点的左/右儿子设置为null，所以我们必须要知道用parent来删
        TreeNode parent = this;
        TreeNode leftChild = null;
        TreeNode rightChild = null;
        if ((leftChild=parent.leftChild) != null && leftChild.getValue() == target) {
            parent.leftChild = null;
            return;
        } else if ((rightChild=parent.rightChild) != null && rightChild.getValue() == target) {
            parent.rightChild = null;
            return;
        }
        //左右子节点都不是 那就递归左右子树
        if (leftChild!=null){
            leftChild.delete(target);
        }
        if (rightChild!=null){
            rightChild.delete(target);
        }
    }
}
