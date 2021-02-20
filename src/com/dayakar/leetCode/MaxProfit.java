package com.dayakar.leetCode;

public class MaxProfit {

    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
       int res= maxProfit(arr);
        System.out.println(res);
    }

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int index=0;


        for(int i = 0; i<prices.length; i++) {
            if(min > prices[i])
            {
                min = prices[i];
                index=i;
            }
        }

        int max=prices[index];
        int max_index=index;
        for(int j=index;j<prices.length;j++){
            if (max<prices[j]){
                max=prices[j];
                max_index=j;
            }
        }

        return prices[max_index]-prices[index];
    }
}
