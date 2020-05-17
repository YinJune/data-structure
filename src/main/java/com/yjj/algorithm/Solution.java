package com.yjj.algorithm;

import java.util.HashMap;

/**
 * @author: YinJunJie
 * @date: 2020/5/15 23:55
 * @description:
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 1, 1};
        int count = subarraySum(arr, 2);
        System.out.println(count);
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int count = 0;
        h.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int sub=sum - k;
            if (h.containsKey(sub)) {
                count += h.get(sum - k);
            }
            int sumCount = h.getOrDefault(sum, 0);
            h.put(sum, sumCount+1);
        }
        return count;
    }
}
