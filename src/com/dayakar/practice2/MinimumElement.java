package com.dayakar.practice2;

/*
Find the minimum element in a sorted and rotated array
A sorted array is rotated at some unknown point, find the minimum element in it.

Input: {5, 6, 1, 2, 3, 4}
Output: 1

Input: {1, 2, 3, 4}
Output: 1

Input: {2, 1}
Output: 1

 */

public class MinimumElement {

    public static void main(String[] args) {
        int[] arr ={2,1};

        int res= findMin(arr);
        System.out.println("Min= "+res);
    }

    private static int findMin(int[] array){

        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }


    private static int findMin(int[] array,int low,int high){
    if (high==low) return array[low];

    int mid=low+(high-low)/2;

    //if (mid<high &&  )

     return 0;
    }

}

