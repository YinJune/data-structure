package com.yjj.algorithm.niuke.jianzhioffer;

/**
 * @author: YinJunJie
 * @date: 2020/5/20 23:13
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution08 {
    public static void main(String[] args) {

    }

    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        int sum = 0;
        int preOne = 2;
        int preTwo = 1;
        for (int i = 3; i <= target; i++) {
            sum = preOne + preTwo;
            preTwo = preOne;
            preOne = sum;
        }
        return sum;
    }
}
