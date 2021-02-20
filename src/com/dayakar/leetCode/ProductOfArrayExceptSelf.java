package com.dayakar.leetCode;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int[] res=productExceptSelf(array);

        System.out.print("{");
        for(int num:res){
            System.out.print(num+" ");
        }
        System.out.print("}");


    }
    public static int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum=1;
            for(int j=0;j<nums.length;j++){

                if(i!=j){
                    sum*=nums[j];
                }
            }
            output[i]=sum;


        }
        return output;
    }


}

