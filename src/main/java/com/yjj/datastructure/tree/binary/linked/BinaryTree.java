package com.yjj.datastructure.tree.binary.linked;

/**
 * @author: YinJunJie
 * @date: 2020/1/16 14:21
 * @description: //度就是子节点的个数
 *         //权节点的附加意义
 */
public class BinaryTree {
  private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 谦虚遍历
     */
    public void preOrderTraversal() {
        if (root!=null){
            root.preOrderTraversal();
            System.out.println();
        }
    }

    /**
     * 中序遍历
     */
    public void inorderTraversal() {
        if (root!=null){
            root.inorderTraversal();
            System.out.println();
        }
    }

    public void postOrderTraversal() {
        if (root!=null){
            root.postOrderTraversal();
            System.out.println();
        }
    }

    /**
     * 前序查找
     * @param target
     */
    public TreeNode preOrderSearch(int target) {
        return root.preOrderSearch(target);
    }

    /**
     * 删除节点 （整棵树全删掉包括子节点）
     * @param target
     */
    public void delete(int target) {
        if (root.getValue()==target){
            root=null;
        }else {
            root.delete(target);
        }
    }
}
