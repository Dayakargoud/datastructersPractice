package com.dayakar.dynamicProgramming;

import com.dayakar.dividandConquer.HouseTheft;

public class HouseTheif {
    //find the max amount can be stolen from houses with no adjucents
    public static void main(String[] args) {
        HouseTheif ht=new HouseTheif();

        int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
        System.out.println(ht.maxMoney(HouseNetWorth)); //41
        HouseNetWorth = new int[]{20, 5, 1, 13, 6, 11, 40};
        System.out.println(ht.maxMoney(HouseNetWorth));  //73
       // int nums[] = {2, 3, 1, 2, 4, 3};
        //int s = ht.minSubArrayLen(7, nums);

      //  System.out.println("MIN Sub Array= " + s);

    }
    private int maxMoney(int[] houseNetWorth){

       return maxMoneyRecursive(houseNetWorth,0);



    }

    private int maxMoneyRecursive(int[] houseNetWorth,int currentIndex){
          if (currentIndex>=houseNetWorth.length){
              return 0;
          }

        int[] DP =new int[houseNetWorth.length+1];
        if (DP[currentIndex]==0){
            int currentHouseStolen=houseNetWorth[currentIndex]+maxMoneyRecursive(houseNetWorth,currentIndex+2);

            int skipCurrentHouse=maxMoneyRecursive(houseNetWorth,currentIndex+1);

            DP[currentIndex]=Math.max(currentHouseStolen,skipCurrentHouse);
        }
        return DP[currentIndex];

    }
}
