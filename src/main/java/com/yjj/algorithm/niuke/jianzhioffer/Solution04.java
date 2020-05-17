package com.yjj.algorithm.niuke.jianzhioffer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: YinJunJie
 * @date: 2020/5/16 21:16
 * @description: 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution04 {
    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = reConstructBinaryTree(pre, in);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0) {
            return null;
        }
        List preList = Arrays.stream(pre).boxed().collect(Collectors.toList());
        List inList = Arrays.stream(in).boxed().collect(Collectors.toList());
        TreeNode root = buildTreeNode(preList, inList);
        return root;
    }

    public static TreeNode buildTreeNode(List<Integer> preList, List<Integer> middleList) {
        if (preList.size() == 1 && middleList.size() == 1) {
            //叶子结点
            return new TreeNode(preList.get(0));
        }
        //元素大于两个，找出根和左右子树
        TreeNode curRoot = new TreeNode(preList.get(0));
        int rootItemIndex = middleList.indexOf(preList.get(0));
        List leftList = middleList.subList(0, rootItemIndex);
        List rightList = middleList.subList(rootItemIndex, middleList.size());
        TreeNode leftNode = buildTreeNode(preList.subList(1, preList.size()), leftList);
        TreeNode rightNode = buildTreeNode(preList.subList(1, preList.size()), rightList);
        curRoot.left = leftNode;
        curRoot.right = rightNode;
        return curRoot;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
