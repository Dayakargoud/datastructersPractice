package com.dayakar.practice2;

import java.util.Scanner;

/*You a given a number N. You need to print the pattern for the given value of N.
        for N=2 the pattern will be
        2 2 1 1
        2 1
        for N=3 the pattern will be
        3 3 3 2 2 2 1 1 1
        3 3 2 2 1 1
        3 2 1

 */
public class Pattern {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          printPattern2(sc.nextInt());
    }

   static void pritnPatter(int n){
        for (int i=0;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void printPattern2(int n){
        int k=1;
        for (int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

