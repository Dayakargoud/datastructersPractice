package com.dayakar.dividandConquer;

public class MinCostToEndofArray {
    public static void main(String[] args) {
        int[][] array =
                {
                        { 4, 7, 8, 6, 4 },
                        { 6, 7, 3, 9, 2 },
                        { 3, 8, 1, 2, 4 },
                        { 7, 1, 7, 3, 7 },
                        { 2, 9, 8, 9, 3 }
                };

        MinCostToEndofArray mca=new MinCostToEndofArray();
        int res=mca.findMin(array,array.length-1,array[0].length-1);
        System.out.println(res);
    }


    int findMin(int[][] array,int row,int column){
        if (row == -1 || column == -1) {  //BASE CASE
            return Integer.MAX_VALUE;
        }
        if (row == 0 && column == 0) { //BASE CASE: If we're at first cell (0, 0),then no need to recurse
            return array[0][0];
        }
        int minCost1=findMin(array,row-1,column); //Case#1 Get min cost if we go 'up' from current cell
        int minCost2=findMin(array,row,column-1); //Case#2 Get min cost if we go 'left' from current cell

        int minCost=Integer.min(minCost1,minCost2);
          int currentCost=array[row][column];
        return minCost+currentCost;
    }
}
