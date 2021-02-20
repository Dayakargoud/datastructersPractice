package com.dayakar.dividandConquer;

public class Subsequence {

    //s1 and s2 two strings
    //find length of longest common sub sequnce
    // Subsequnce is sequence that can be derived from another sequence by deleting elements without changing order.


    public static void main(String[] args) {
        Subsequence s=new Subsequence();
       int ll= s.longestSubSequnce("elephant","eretpat",0,0);
        System.out.println(ll);
    }

    private int longestSubSequnce(String s1,String s2,int i1,int i2){
         if (i1==s1.length() || i2==s2.length()){
             return 0;
         }
        int c3=0;

       if (s1.charAt(i1)==s2.charAt(i2)){
         c3=1+longestSubSequnce(s1,s2,i1+1,i2+1);

       }

       int c1=longestSubSequnce(s1,s2,i1,i2+1);
       int c2=longestSubSequnce(s1, s2, i1+1, i2);
       return Math.max(c1,Math.max(c2,c3));

    }


}
