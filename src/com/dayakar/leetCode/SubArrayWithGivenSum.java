package com.dayakar.leetCode;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] ={1, 4, 0, 0, 3, 10, 5};
        int sum = 7;
        findSubArray(arr,sum);
    }

    private static void findSubArray(int[] array,int target){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum=array[i];
            for (int j=i+1;j<array.length;j++){

                if (sum==target){
                    int p = j - 1;
                    System.out.println(
                            "Sum found between indexes " + i
                                    + " and " + p);
                    return;
                }
                if (sum>target){
                    break;
                }
                sum=sum+array[j];
            }
        }
    }
}
