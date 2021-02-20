package com.dayakar.dividandConquer;

import java.util.List;

//program to create number of ways to create the given num with 1,3,4
public class NumberFactor {


    public static void main(String[] args) {
        NumberFactor n=new NumberFactor();

        System.out.println(n.waystoGetN(4));
        System.out.println(n.waystoGetN(5));
    }
    private int waystoGetN(int n){
        if (n==0||n==1||n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }
        int sub1=waystoGetN(n-1);
        int sub2=waystoGetN(n-3);
        int sub3=waystoGetN(n-4);
        return sub1+sub2+sub3;

    }

    public static long getWays(int n, List<Long> c) {
        // Write your code here
        if (n==0||n==1||n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }
        long ways=0;
        for(int i=0;i<c.size();i++){
            ways=getWays((int) (n-c.get(i)),c);

        }
         return ways;

    }

}
