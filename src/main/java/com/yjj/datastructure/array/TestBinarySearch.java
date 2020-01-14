package com.yjj.datastructure.array;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 13:16
 * @description: 二分查找 有序的
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //目标元素
        int target = 9;
        //目标元素所在的下标
        int index = -1;
        //开始位置
        int begin = 0;
        //结束位置
        int end = arr.length - 1;
        //中间位置
        int mid = (begin + end) / 2;
        //循环查找
        while (true) {
            //结束循环条件 开始位置在结束位置之后或重合
            if (begin>end||begin==end){
                break;
            }
            //中间元素如果是目标元素则返回
            if (arr[mid] == target) {
                index = mid;
               break;
            }
            //目标元素小于中间元素
            if (arr[mid] > target) {
                //向左查找
                end = mid - 1;
            } else {
                //向右
                begin = mid + 1;
            }
            //重新计算mid位置
            mid = (begin + end) / 2;
        }
        System.out.println(index);
    }
}
