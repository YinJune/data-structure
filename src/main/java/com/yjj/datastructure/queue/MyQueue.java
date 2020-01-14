package com.yjj.datastructure.queue;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 14:35
 * @description: 先进先出
 */
public class MyQueue {
    private int[] elements;

    //入队 队尾
    public void add(int element) {
        //往数组末尾添加一个元素
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

    //出队
    public int poll(){
        int element=elements[0];
        //数组元素前移
        int[] newArr=new int[elements.length-1];
        //复制
        for (int i=0;i<newArr.length;i++){
            newArr[i]=elements[i+1];
        }
        elements=newArr;
        return element;
    }
}
