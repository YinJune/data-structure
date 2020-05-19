package com.yjj.algorithm.niuke.jianzhioffer;

/**
 * @author: YinJunJie
 * @date: 2020/5/19 22:37
 * @description:
 */
public class Fibonacci {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21 34 55
        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        int sum =0;
        int preOne=1;
        int preTwo=0;
        for (int i=1;i<n;i++){
            sum=preOne+preTwo;
            preTwo=preOne;
            preOne=sum;
        }
        return sum;
    }
}
