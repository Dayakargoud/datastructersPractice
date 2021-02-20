package com.dayakar.dynamicProgramming;

public class NumberFactor {

    public static void main(String[] args) {
        NumberFactor en = new NumberFactor();
        System.out.println(en.numOfWaysToGetN(8));
        //System.out.println(en.waysToGetN(5));
        //System.out.println(en.waysToGetN(6));
    }
    public int waysToGetN(int n) {
        if ((n == 0) || (n == 1) || (n == 2)) // { }, {1}, {1,1}
            return 1; //
        if (n == 3)
            return 2; // {1,1,1}, {3}

        int subtract1 = waysToGetN(n - 1); // if we subtract 1, we will be left with 'n-1'
        int subtract3 = waysToGetN(n - 3); // if we subtract 3, we will be left with 'n-3'
        int subtract4 = waysToGetN(n - 4); // if we subtract 4, we will be left with 'n-4'

        return subtract1 + subtract3 + subtract4;
    }

    // 1,3,4
    private int numOfWaysToGetN(int n){

        if (n==0||n==1||n==2){
            return 1;
        }
        if (n==3){
            return 2;
        }

        int sub1=numOfWaysToGetN(n-1);
        int sub3=numOfWaysToGetN(n-3);
        int sub4=numOfWaysToGetN(n-4);

        return sub1+sub3+sub4;
    }

}
