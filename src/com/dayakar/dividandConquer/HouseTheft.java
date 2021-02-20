package com.dayakar.dividandConquer;

//find the max amount can be stolen from houses with no adjucents

import java.util.ArrayList;
import java.util.List;

public class HouseTheft {

    public static void main(String[] args) {
        HouseTheft ht = new HouseTheft();
        int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
        System.out.println("Max Amount = "+ht.maxAmount(HouseNetWorth));
        HouseNetWorth = new int[]{20, 5, 1, 13, 6, 11, 40};
        System.out.println( "Max Amount = "+ht.maxAmount(HouseNetWorth));
        int nums[] = {2, 3, 1, 2, 4, 3};
        int s = ht.minSubArrayLen(7, nums);

        System.out.println("MIN Sub Array= " + s);

    }

    private int maxAmount(int[] houseNetWorth) {
        return maxRecursive(houseNetWorth, 0);
    }

    private int maxRecursive(int[] houseNetWorth, int currentIndex) {
        if (currentIndex >= houseNetWorth.length) {
            return 0;
        }
        int stealCurrentHouse = houseNetWorth[currentIndex] + maxRecursive(houseNetWorth, currentIndex + 2);
        int skipCurrentHouse = maxRecursive(houseNetWorth, currentIndex + 1);
        return Math.max(stealCurrentHouse, skipCurrentHouse);
    }

    public int minSubArrayLen(int s, int[] nums) {

        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                minLen = Math.min(minLen, i - start + 1);
                sum -= nums[start++];
            }
        }

        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < a.size(); i++) {

            if (a.get(0) == b.get(i)) {
                continue;
            }
            if (a.get(i) > b.get(i)) {
                aSum += 1;
            }
            if (a.get(i) < b.get(i)) {
                bSum += 1;

            }
            list.add(aSum);
            list.add(bSum);
            return list;

        }
    return list;}
}
