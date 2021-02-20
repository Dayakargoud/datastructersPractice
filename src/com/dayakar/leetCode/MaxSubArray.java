package com.dayakar.leetCode;


/*    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
       Output: 6
       Explanation: [4,-1,2,1] has the largest sum = 6

*/

public class MaxSubArray {
    public static void main(String[] args) {
          int[] nums={-2,1,-3,4,-1,2,1,-5,4};
          MaxSubArray obj=new MaxSubArray();
          int max=obj.maxSubArray(nums);
        System.out.println(max);


    }

    //kadene algorithm
    public int maxSubArray(int[] nums) {
        int current_max=nums[0];
        int max=nums[0];

        for (int i=1;i<nums.length;i++){

            current_max=Math.max(nums[i],nums[i]+current_max);

            if (current_max>max){
                max=current_max;
            }

        }

        return max;
    }
}
