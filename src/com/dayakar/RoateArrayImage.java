package com.dayakar;

public class RoateArrayImage {
    public static void main(String[] args){
      int[][] array= {{1,2,3},{4,5,6},{7,8,9}};


//      for(int i=0;i<array.length;i++){
//        for(int j=0;j<array[i].length;j++){
//            System.out.print(array[i][j]);
//        }
//          System.out.println();
//      }


        int[] ele={1,2,3,4,5,6,7,8};
        int shiftBy=2;
        int[] temp=new int[shiftBy];
        for(int i=0;i<shiftBy;i++){
            temp[i]=ele[i];
        }

        for(int i=0;i<ele.length;i++){
            ele[i]=ele[i+2];
        }

}


}
