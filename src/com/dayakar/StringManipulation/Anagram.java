package com.dayakar.StringManipulation;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){

     boolean res=areAngarms("silent".toCharArray(),"silent".toCharArray());
       // System.out.println(res);
      int length=  makeAnagram("cde".toCharArray(),"abc".toCharArray());
        System.out.println(length);

        int length2=  makeAnagrams("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        System.out.println(length2);
        int length3=  numRemoved("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        System.out.println(length3);
    }

    static boolean areAngarms(char[] str1,char[] str2){

        if (!(str1.length ==str2.length)){
            return false;
        }


           for(int i=0;i<str1.length;i++){
               if (str1[i]!=str2[i]){
                   return false;
               }
           }

        return true;
    }


    static int makeAnagram(char[] str1,char[] str2){
        int length1=str1.length;
        int length2=str2.length;
        StringBuilder same= new StringBuilder();
        for (int i=0;i<str1.length;i++){
            for (int j=0;j<str2.length;j++){
                if (str1[i]==str2[j]){
                    same.append(str1[i]);
                }
            }

        }
         int total=(length1-same.length())+(length2-same.length());
        System.out.println(same);
        return total;
    }
    static int makeAnagrams(String a,String  b){
        int length1=a.length();
        int length2=b.length();
        String same="";
        for (int i=0;i<length1;i++){
            for (int j=0;j<length2;j++){
                if (a.charAt(i)==b.charAt(j)){
                    same=same+(a.charAt(i));
                }
            }

        }
        System.out.println(same);

        int total=(length1-same.length())+(length2-same.length());
        return total;
    }

    static int numRemoved(String a,String b){
        int[] lettercounts = new int[26];

        for(char c : a.toCharArray()){
            System.out.println(c+" "+(c-'a'));
            lettercounts[c-'a']++;

        }


        for(char c : b.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }
}
