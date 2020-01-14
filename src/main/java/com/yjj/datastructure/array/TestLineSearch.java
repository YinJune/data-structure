package com.yjj.datastructure.array;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 13:12
 * @description: 线性查找
 */
public class TestLineSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr =new int[]{7,1,5,3,4,6,8,2};
        //目标元素
        int target=5;
        //目标元素所在的下标
        int index=-1;
        //遍历数组
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                index=i;
                break;
            }
        }
        //打印下标
        System.out.println("index="+index);
    }
}
