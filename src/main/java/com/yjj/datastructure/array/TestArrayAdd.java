package com.yjj.datastructure.array;

import java.util.Arrays;

/**
 * @author: YinJunJie
 * @date: 2020/1/13 22:32
 * @description:
 */
public class TestArrayAdd {
    public static void main(String[] args) {
        //一个长度为3的数组装满后想再塞一个元素咋整
        //解决数组长度不可变问题  -> 创建新数组 复制
        int[] arr=new int[]{9,8,7};
        //快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        //要加入数组的目标元素
        int dist=6;

        //想要把dist加入数组中
        // 1.创建一个新数组，长度为原数组长度+1
        int[] newArr=new int[arr.length+1];
        // 2.把原数组中的数据复制到新数组
        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
        // 3.把目标数组放入新数组的最后
        newArr[newArr.length-1]=dist;
        System.out.println(Arrays.toString(newArr));
        // 4.新数组替换原数组
        arr=newArr;
        System.out.println(Arrays.toString(arr));
    }
}
