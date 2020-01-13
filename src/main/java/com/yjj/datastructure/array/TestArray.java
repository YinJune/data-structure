package com.yjj.datastructure.array;

/**
 * @author: YinJunJie
 * @date: 2020/1/13 22:10
 * @description:
 */
public class TestArray {
    public static void main(String[] args) {
        //数组长度不可变
        //创建一个数组
        int[] arr1=new int[3];
        //获取数组长度
        int length=arr1.length;
        //输出长度
        System.out.println("arr1 lenth:"+length);
        //访问数组中的元素：数组名[下标] 从0开始最大到长度-1
        int element0=arr1[0];
        System.out.println("element0:"+element0);
        //为数组中的元素赋值
        arr1[0]=99;
        System.out.println("element0:"+element0);
        arr1[1]=98;
        arr1[2]=97;
        //遍历数组
        for (int i=0;i<arr1.length;i++){
            System.out.println("arr1 element"+i+":"+arr1[i]);
        }
        //创建数组的同时为元素赋值
        int[] arr2=new int[]{1,2,3};
        //获取数组的长度
        System.out.println("arr2 lenth:"+arr2.length);
    }
}
