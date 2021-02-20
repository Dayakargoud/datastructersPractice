package com.dayakar.hackerRank;

public class Kangaroo {
    public static void main(String[] args) {
        kangaroo(0,3,4,2);

    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int first=x1;
        int second=x2;
        for (int i=0;i<Integer.MAX_VALUE;i++){
            first+=v1;
            second+=+v2;

            if (first==second){

                return "Yes";

            }

        }
       return "No";
    }
}
