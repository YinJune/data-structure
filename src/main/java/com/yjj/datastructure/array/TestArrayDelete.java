package com.yjj.datastructure.array;

import java.util.Arrays;

/**
 * @author: YinJunJie
 * @date: 2020/1/13 22:32
 * @description: 删除数组中的元素
 */
public class TestArrayDelete {
    public static void main(String[] args) {
        //目标数组
       int[] arr=new int[]{9,8,7,6,5,4};
       //要删除的元素的下标
        int distIndex=3;
        //创建一个新数组 长度是原数组长度-1
        int[] newArr =new int[arr.length-1];
        for (int i=0;i<newArr.length;i++){
            if (i<distIndex){
                newArr[i]=arr[i];
            }else {
                newArr[i]=arr[i+1];
            }
        }
        //替换原数组
        arr=newArr;
        System.out.println(Arrays.toString(arr));
    }
}
