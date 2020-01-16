package com.yjj.datastructure.sort;

import java.util.Arrays;

/**
 * @author: YinJunJie
 * @date: 2020/1/15 14:58
 * @description: 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 9, 0, 5, 7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] array) {
        for (int index = 1; index < array.length; index++) {//外层向右的index，即作为比较对象的数据的index
            int temp = array[index];//用作比较的数据
            int leftIndex = index - 1;
            while (leftIndex >= 0 && array[leftIndex] > temp) {//当比到最左边或者遇到比temp小的数据时，结束循环
                array[leftIndex + 1] = array[leftIndex];
                leftIndex--;
            }
            array[leftIndex + 1] = temp;//把temp放到空位上
        }
    }
}
