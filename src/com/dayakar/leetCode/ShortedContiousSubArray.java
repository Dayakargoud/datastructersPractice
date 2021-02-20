package com.dayakar.leetCode;

import java.util.Arrays;

public class ShortedContiousSubArray {
    public static void main(String[] args) {
         int array[]={2, 6, 4, 8, 10, 9, 15};
        System.out.println(1|5);
        System.out.println(1&5);
        System.out.println(1^5);
      //  System.out.println(findUnsortedSubarray(array));
    }
    public static int findUnsortedSubArray(int[] nums) {

        int [] sortdeArray= nums.clone();

        Arrays.sort(sortdeArray);
        int start=nums.length; int end=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
                if (nums[i]!=sortdeArray[i]){
                    start=Math.min(start,i);
                    end=Math.max(end,i);
            }
        }
         int val=(end-start)+1;
        return val;
    }
}
