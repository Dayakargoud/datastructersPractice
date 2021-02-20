package com.dayakar.leetCode;
/*
The inversions of an array indicate; how many changes are required to convert the array into its sorted form.
 When an array is already sorted,it needs 0 inversions,
 and in other case, the number of inversions will be maximum, if the array is reversed
 */
public class ArrayInversionCount {

    public static void main(String[] args) {
        int[] array = {1, 20, 6, 4};
        System.out.println("Total Inversions= "+findInversionCount(array));
    }

    private static int findInversionCount(int[] array){
        int count=0;
        for (int i=0;i<array.length-1;i++){

            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    count++;
                }
            }
        }
    return count;}
}
