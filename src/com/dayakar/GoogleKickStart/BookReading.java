package com.dayakar.GoogleKickStart;

import java.util.ArrayList;

public class BookReading {

    public static void main(String[] args) {
        int[] array0 = {11, 11, 11};
        int[] tornOutPageNumbers0 ={1,2,3,4,5,6,7,8,9,10,11};
        int[] userPageMultiples0 = {1,2,3,4,5,6,7,8,9,10,11};
      // int res0= getTotalReadPagesByAll(array0,tornOutPageNumbers0,userPageMultiples0);
      //  System.out.println("Total Pages= " + res0);

        //case2
        int[] array1 = {11, 1, 2};
        int[] tornOutPageNumbers1 ={8};
        int[] userPageMultiples1 = {2,3};
       //int res1= getTotalReadPagesByAll(array1,tornOutPageNumbers1,userPageMultiples1);
        //System.out.println("Total Pages= " + res1);

        //case3

        int[] array2 = {1000, 2, 1};
        int[] tornOutPageNumbers2 ={ 2,3};
        int[] userPageMultiples2 = {1};
        int res2=getTotalReadPagesByAll(array2,tornOutPageNumbers2,userPageMultiples2);
        System.out.println("Total Pages= " + res2);



    }

    private static int getTotalReadPagesByAll(int[] input1,int[] tornPages,int[] userMultiples ) {


        int[] array =input1;
        int[] tornOutPageNumbers =tornPages;
        int[] userPageMultiples = userMultiples;

        int total_pages = array[0];
        int tornOutPages = array[1];
        int totalUsers = array[2];

        if (total_pages==tornOutPages) return 0;

        int count = 0;
        for (int j = 1; j <= total_pages; j++) {
            for (int i = 0; i < totalUsers; i++) {
                for (int tornOutPageNumber : tornOutPageNumbers) {
                    if (j != tornOutPageNumber)
                        if (j % userPageMultiples[i] == 0) {
                            count++;
                        }
                }
            }

            }




        return count;}

}
