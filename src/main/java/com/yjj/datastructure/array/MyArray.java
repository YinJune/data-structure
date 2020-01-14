package com.yjj.datastructure.array;

import java.util.Arrays;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 11:17
 * @description: 面向对象的数组 提供了增删改查的方法
 */
public class MyArray {
    //用于存储数据的数组
    private int[] elements;

    public MyArray() {
        this.elements = new int[0];
    }

    //获取数组长度的方法
    public int size() {
        return elements.length;
    }

    //往数组末尾添加一个元素
    public void add(int element) {
        //创建一个新数组
        int[] newArr = new int[elements.length + 1];
        //复制
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把元素放入新数组中
        newArr[newArr.length - 1] = element;
        //替换
        elements = newArr;
    }

    //删除某个位置的元素
    public void delete(int index) {
        if (index < 0 || index >= elements.length) {
            throw new RuntimeException("数组下标越界");
        }
        //创建新数组 长度-1
        int[] newArr = new int[elements.length - 1];
        //复制
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        //替换
        elements = newArr;
    }

    //获取某个位置上的元素
    public int get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new RuntimeException("数组下标越界");
        }
        return elements[index];
    }

    //插入一个元素到指定位置
    public void insert(int index, int element) {
        if (index < 0 || index >= elements.length) {
            throw new RuntimeException("数组下标越界");
        }
        //创建一个新数组
        int[] newArr = new int[elements.length + 1];
        //复制
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i + 1] = elements[i];
            }
        }
        //放index
        newArr[index] = element;
        //替换
        elements = newArr;
    }

    //替换指定位置元素
    public void set(int index, int element) {
        if (index < 0 || index >= elements.length) {
            throw new RuntimeException("数组下标越界");
        }
        elements[index] = element;
    }

    // 线性查找
    public int search(int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public int binarySearch(int target){
        //目标元素所在的下标
        int index = -1;
        //开始位置
        int begin = 0;
        //结束位置
        int end = elements.length - 1;
        //中间位置
        int mid = (begin + end) / 2;
        //循环查找
        while (true) {
            //结束循环条件 开始位置在结束位置之后或重合
            if (begin>end||begin==end){
                return -1;
            }
            //中间元素如果是目标元素则返回
            if (elements[mid] == target) {
                index = mid;
                return index;
            }
            //目标元素小于中间元素
            if (elements[mid] > target) {
                //向左查找
                end = mid - 1;
            } else {
                //向右
                begin = mid + 1;
            }
            //重新计算mid位置
            mid=(begin+end)/2;
        }
    }

    //打印所有元素
    public void show() {
        System.out.println(Arrays.toString(elements));
    }
}
