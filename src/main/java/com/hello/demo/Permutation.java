package com.hello.demo;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return res;
        }
        generateFirstPermutation(nums);
        return res;
    }

    private void generateFirstPermutation(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if (list.size() == nums.length) {
            res.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i< nums.length; i++) {
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            generateFirstPermutation(nums);
            list.remove(list.size()-1);
        }
        
    } 
    
}
