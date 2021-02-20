package com.dayakar.dividandConquer;

public class LongestPalindromicSubseqence {

    public static void main(String[] args) {
          LongestPalindromicSubseqence s=new LongestPalindromicSubseqence();
          String test="ELREMENMET";
         int length=s.lpss(test,0,test.length()-1);
        System.out.println(length);

    }

    int lpss(String s,int startIndex,int endIndex){

        if (startIndex>endIndex){   //it means we have travelled morethan half of string
            return 0;
        }
        if (startIndex==endIndex){        //if both at same index it is a palindrome with one character
            return 1;
        }

        int c1=0;
        if (s.charAt(startIndex)==s.charAt(endIndex)){
            c1=2+lpss(s,startIndex+1,endIndex-1);
        }

        int c2=lpss(s,startIndex+1,endIndex);
        int c3=lpss(s,startIndex,endIndex-1);

        return Math.max(c1,Math.max(c2,c3));
    }
}
