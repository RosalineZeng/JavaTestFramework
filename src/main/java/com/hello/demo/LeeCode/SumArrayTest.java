package com.hello.demo.LeeCode;

public class SumArrayTest {

    public static void main(String[] args) {
        // int[] nums = {3,3};
        // int target = 6;
        // System.out.println("The 2 下标是：");
        // int[] results = twoSum(nums, target);
        // for(int i = 0; i< results.length; i++) {
        //     System.out.println(results[i]);
        // }

        System.out.println("他是回文数吗：" + isPalindrome(1001));
    }

    public static int[] twoSum(int[] nums, int target) {
        /**
         * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
         * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
         */
        int[] results = new int[2];
        for (int i=0; i<nums.length; i++) {
            for(int j=1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target && i != j) {
                    results[0] = i;
                    results[1] = j;
                }
            }
        }
        return results;
    
    }

    public static boolean isPalindrome(int x) {
        //判断回文数
        String sx = (Integer.valueOf(x)).toString();
        if(sx.length() < 2) {
            return true;
        }

        int j = sx.length()-1;
        for(int i=0; i< (sx.length())/2; i++) {
            int a = sx.charAt(i);
            int b = sx.charAt(j);
            if(a != b) {
                return false;
            } else {
                j--;
            }
            
        }
        return true;
    }
}
