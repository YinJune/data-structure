package com.yjj.datastructure.tree.binary.sort;

/**
 * @author: YinJunJie
 * @date: 2020/1/17 10:50
 * @description:
 */
public class BinarySearchTree {
    private TreeNode root;

    public void add(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 中序遍历
     */
    public void inOrderTraversal() {
        if (root != null) {
            root.inOrderTraversal();
        }
        System.out.println();
    }

    /**
     * 查找
     *
     * @param target
     * @return
     */
    public TreeNode search(int target) {
        if (root != null) {
            return root.search(target);
        }
        return null;
    }

    /**
     * 删除 1：叶子结点 2：非叶子节点（一个子节点、两个子节点）
     *
     * @param target
     */
    public void delete(int target) {
        if (root == null) {
            return;
        }
        //找到该节点
        TreeNode targetNode = search(target);
        if (targetNode == null) {
            return;
        }
        //找到他的父节点
        TreeNode parent = searchParentNode(target);
        if (parent == null) {
            root = null;
        }
        //第一种情况，删除的节点是叶子结点
        if (targetNode.leftNode == null && targetNode.rightNode == null) {
            //判断是左节点还是右节点
            if (parent.leftNode.value == target) {
                parent.leftNode = null;
            } else {
                parent.rightNode = null;
            }
        } else if (targetNode.leftNode != null && targetNode.rightNode != null) {
            //第二种情况 删除的节点有两个子节点
            //1.删除右子树值最小的节点、或渠道该节点的值
            int min = deleteRightSubTreeMin(targetNode.leftNode);
        } else {
            //第三种情况 删除的节点有一个儿子
            if (targetNode.leftNode != null) {
                //有左子节点
                //判断是左节点还是右节点
                if (parent.leftNode.value == target) {
                    parent.leftNode = targetNode.leftNode;
                } else {
                    parent.rightNode = targetNode.leftNode;
                }
            } else {
                //有右子节点
                //判断是左节点还是右节点
                if (parent.leftNode.value == target) {
                    parent.leftNode = targetNode.rightNode;
                } else {
                    parent.rightNode = targetNode.rightNode;
                }
            }

        }
    }

    /**
     * 删除中最小值
     *
     * @param leftNode
     * @return
     */
    private int deleteRightSubTreeMin(TreeNode leftNode) {

        return 0;
    }

    /**
     * 搜索父节点
     *
     * @param target
     * @return
     */
    public TreeNode searchParentNode(int target) {
        if (root == null || root.value == target) {
            return null;
        }
        return root.searchParent(target);
    }
}
