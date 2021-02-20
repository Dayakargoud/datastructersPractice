package com.dayakar.GreedyAlgo;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int [] coins = {1, 2, 5, 10, 50, 100, 500,2000};
        int amount = 2758;
        System.out.println("Coins available: "+Arrays.toString(coins));
        System.out.println("Target amount: "+ amount);
        findMinCoins(coins,amount);
      //  CoinChangeProblem.coinChangeProblem(coins, amount);
    }

    static void findMinCoins(int[] coins,int N){
        int result=0;
           int index=coins.length-1;
       while (true){
           int coinValue=coins[index];
           index--;
           int maxAmount=(N/coinValue)*coinValue;
           if (maxAmount>0){
               System.out.println("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
               N = N - maxAmount;
           }
           if (N==0) break;;

       }
    }

    static void coinChangeProblem(int [] coins, int N) {

        Arrays.sort(coins);//Sort the coins in ascending order
        int index = coins.length-1;
        while(true){
            int coinValue = coins[index];
            index--;
            int maxAmount = (N/coinValue)*coinValue;
            if(maxAmount>0) {
                System.out.println("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
                N = N - maxAmount;
            }
            if(N==0)break;
        }//end of while loop
    }//end of method
}
