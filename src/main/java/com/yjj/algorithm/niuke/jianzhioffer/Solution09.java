package com.yjj.algorithm.niuke.jianzhioffer;

/**
 * @author: YinJunJie
 * @date: 2020/5/20 23:13
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution09 {
    public static void main(String[] args) {

    }

    public int JumpFloorII(int target) {
        return 1<<(target-1);
    }
}
