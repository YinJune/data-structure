package com.yjj.datastructure.sort;

import java.util.Arrays;

/**
 * @author: YinJunJie
 * @date: 2020/1/15 10:25
 * @description: 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        /**
         * 快速排序思路
         */
        int[] arr = new int[]{5, 7, 2, 9, 0, 5, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 快速排序 一定画个图理解一下
     *
     * @param arr   需排序的数组
     * @param start 开始索引
     * @param end   结束索引
     * @return
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //把待排序数组中的第1个数字作为标准数
            int standard = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //循环找比标准数大的数和比标准数小的数
            while (low < high) {
                while (low < high && standard <= arr[high]) {
                    //右边数字比标准数大
                    high--;
                }
                //右边数字比标准数小
                arr[low] = arr[high];
//                low++;
                while (low < high && arr[low] <= standard) {
                    low++;
                }
                //换
                arr[high] = arr[low];
//                high--;
            }
            //此时low和high重合，把标准数填到此位置，此时该位置之前元素都比标准数小，之后元素都比标准数大
            arr[low] = standard;
            //标准数左边的再排
            quickSort(arr, start, low);
            //标准数右边的也排
            quickSort(arr, high + 1, arr.length - 1);
        }
    }

}
