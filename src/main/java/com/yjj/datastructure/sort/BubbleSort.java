package com.yjj.datastructure.sort;

import java.util.Arrays;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 21:14
 * @description:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 9, 0, 5, 7};
        arr=bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /** 大的往后沉
     * 5, 7, 2, 9, 0, 5, 7 第一轮 比较length-1次
     * 5, 7, 2, 9, 0, 5, 7 第1次
     * 5, 2, 7, 9, 0, 5, 7 第2次
     * 5, 2, 7, 9, 0, 5, 7 第3次
     * 5, 2, 7, 0, 9, 5, 7 第4次
     * 5, 2, 7, 0, 5, 9, 7 第5次
     * 5, 2, 7, 0, 5, 7, 9 第6次
     * 5, 2, 7, 0, 5, 7, 9 第二轮 比较5次
     */
    public static int[] bubbleSort(int[] arr) {
        //控制共比较多少轮
        for (int i = 0; i < arr.length; i++) {
            //控制开始和结束的位置
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
