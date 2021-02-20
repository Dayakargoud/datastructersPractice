package com.dayakar.leetCode;

import java.util.HashMap;

//LeetCode 1
public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = ts.findTwoSum3(nums, target);
        for (int i : res) {
            System.out.println(i);
        }
    }

    //O(n^2) time complexity
    private int[] findTwoSum(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int diff = target - array[i];
                if (array[j] == diff) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("can't find good match");
    }
   // time complexity= O(n^2)
    private int[] findTwoSum2(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Can't find good match");
    }

    //time complexity= O(n^2)

    private int[] findTwoSum3(int[] array,int target){
        //looping through one time we can get expected result
        HashMap<Integer,Integer> map=new HashMap<>();      //key=value of number, value =position of number in array

        for (int i=0;i<array.length;i++){
            int difference=target-array[i];

            if (map.containsKey(difference)){
                return new int[]{i,map.get(difference)};
            }
            map.put(array[i],i);
        }

        throw new IllegalArgumentException("Not found");
    }
}
