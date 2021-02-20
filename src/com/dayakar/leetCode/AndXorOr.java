package com.dayakar.leetCode;

import java.util.Scanner;

public class AndXorOr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases=s.nextInt();
        int[][] testArrays=new int[testCases][testCases];

        for (int i=0;i<testCases;i++){
            int lentgh = s.nextInt();
            int[] arr=new  int[lentgh];
            for (int j=0;j<lentgh;j++){
                int ele=s.nextInt();
                arr[j]=ele;
            }
            testArrays[i]=arr;

        }
        for (int k=0;k<testCases;k++){
            System.out.println(findMin(testArrays[k]));
        }

    }

    private static int findMin(int[] array){

        int ans=Integer.MAX_VALUE;

        for (int i=0;i<array.length-1;i++){
            int val=array[i] ^ array[i+1];
            ans=Math.min(val,ans);
        }
        return ans;

    }
}
