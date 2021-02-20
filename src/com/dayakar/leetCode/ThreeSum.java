package com.dayakar.leetCode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> list=new ArrayList<>();

        if (nums.length <= 2) return list;

        int sum=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

            if (sum==0){
               li.add(sum);
            }

        }

        return list;
    }
}
