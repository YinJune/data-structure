package com.yjj.algorithm.niuke.jianzhioffer;

/**
 * @author: YinJunJie
 * @date: 2020/5/16 21:16
 * @description:
 */
public class Solution01 {
    public static void main(String[] args) {

    }

    public boolean find(int target, int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }
        int cols = array[0].length;
        if (cols == 0) {
            return false;
        }
        // 左下
        int row = rows - 1;
        int col = 0;
        while (row >= 0 && col < cols) {
            if (array[row][col] < target) {
                col++;
            } else if (array[row][col] > target) {
                row--;
            } else {
                return true;
            }
        }
        return false;
    }
}
