package com.dayakar.hackerRank;

import java.util.Scanner;

public class ApplesAnsOranges {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.nextLine();

        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();

        int m=sc.nextInt();
        int n=sc.nextInt();

        int[] apples=new int[m];
        int[] oranges=new int[n];


        for (int i=0;i<m;i++){
            apples[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            oranges[i]=sc.nextInt();
        }

    countApplesAndOranges(start,end,a,b,apples,oranges);

    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount=0;
        int orangeCount=0;

        for (int i=0;i<apples.length;i++){
            int sum=a+apples[i];
            if (sum>=s && sum<=t){
                appleCount++;
            }
        }
        for (int i=0;i<oranges.length;i++){
            int sum=b+oranges[i];
            if (sum>=s && sum<=t){
                orangeCount++;
            }
        }
        System.out.println("Apples= "+appleCount);
        System.out.println("Oranges= "+orangeCount);
    }

}
