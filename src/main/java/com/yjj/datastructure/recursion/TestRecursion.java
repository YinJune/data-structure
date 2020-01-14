package com.yjj.datastructure.recursion;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 20:34
 * @description:
 */
public class TestRecursion {
    public static void main(String[] args) {
        //斐波那契数列：1 1 2 3 5 8 13
        System.out.println(febonacci(7));


    }

    public static int febonacci(int i){
        if (i==1||i==2){
            return 1;
        }else {
            return febonacci(i-2)+febonacci(i-1);
        }
    }


    public static void print(int i){
        if (i>0){
            System.out.println(i);
            print(i-1);
        }
    }
}
