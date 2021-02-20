package com.dayakar.GoogleKickStart;

public class IntegerDistribution {
    public static void main(String[] args) {

        findMinMax(new int[]{1,2,3,4});
    }

    private static int findMinMax(int[] array){


        for (int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++)

            System.out.println(array[i]+" ^ "+ array[j]+" = "+(array[i]^array[j]));
        }
        return 0;
    }
}
