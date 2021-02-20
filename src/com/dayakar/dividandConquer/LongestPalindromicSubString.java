package com.dayakar.dividandConquer;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
          LongestPalindromicSubString lps=new LongestPalindromicSubString();
          String word="MAMDRDM";
          int lenth=lps.lpss(word,0,word.length()-1);

        System.out.println(lenth);
        String word2="MQADASM";
        int lenth2=lps.lpss(word2,0,word2.length()-1);

        System.out.println(lenth2);

    }


    private int lpss(String string,int startIndex,int endIndex){

        if (startIndex > endIndex) {//BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
            return 0;
        }
        if (startIndex == endIndex) {//BASE CASE - If both the index are at same position then its a palidrome as its 1 character.
            return 1;
        }
        int c1 = 0;
        if (string.charAt(startIndex) == string.charAt(endIndex)) {  //CASE#1 - If index pointed characters matches then we
            int remainingLength = endIndex - startIndex - 1;	   	 //add 2 to the existing known palindrome length only if
            //remaining string is a palindrome too
            if (remainingLength == lpss(string, startIndex + 1, endIndex - 1))
                c1 = remainingLength + 2;
        }
        int c2 = lpss(string, startIndex + 1, endIndex);//CASE#2 - Skip one element from beginning
        int c3 = lpss(string, startIndex, endIndex - 1);//CASE#3 - Skip one element from end
        return Math.max(c1, Math.max(c2, c3));
    }
}
