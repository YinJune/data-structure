package com.yjj.datastructure.tree.binary.sort;

/**
 * @author: YinJunJie
 * @date: 2020/1/17 14:16
 * @description:
 */
public class TreeNode {
     int value;
     TreeNode leftNode;
     TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    /**
     * 向子树中添加节点
     *
     * @param node
     */
    public void add(TreeNode node) {
        if (node == null) {
            return;
        }
        //判断传入的节点和当前子树根节点的大小
        if (node.value < this.value) {
            if (this.leftNode == null) {
                this.leftNode = node;
            } else {
                this.leftNode.add(node);
            }
        } else {
            if (this.rightNode == null) {
                this.rightNode = node;
            } else {
                this.rightNode.add(node);
            }
        }
    }

    /**
     * 中序遍历
     */
    public void inOrderTraversal() {
        if (this.leftNode != null) {
            this.leftNode.inOrderTraversal();
        }
        System.out.printf(this.value + " ");
        if (this.rightNode != null) {
            this.rightNode.inOrderTraversal();
        }
    }

    public TreeNode search(int target) {
        if (this.value == target) {
            return this;
        } else if ((this.value > target)) {
            if (this.leftNode == null) {
                return null;
            }
            return this.leftNode.search(target);
        } else {
            if (this.rightNode == null) {
                return null;
            }
            return this.rightNode.search(target);
        }
    }

    /**
     * 搜索父节点
     *
     * @param target
     * @return
     */
    public TreeNode searchParent(int target) {
        if (this.value>target){
            if (this.leftNode!=null){
                if (this.leftNode.value==target){
                    return this;
                }else {
                    return this.leftNode.searchParent(target);
                }
            }
        }
        if (this.value<target){
            if(this.rightNode!=null){
                if (this.rightNode.value==target){
                    return this;
                }else {
                    return this.rightNode.searchParent(target);
                }
            }
        }
       return null;
    }
}
