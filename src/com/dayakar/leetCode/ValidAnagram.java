package com.dayakar.leetCode;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s="cab";
        String t="bac";
        s.length();
       boolean res= isValidAnagram(s,t);
        System.out.println(res);

    }

    private static Boolean isValid(String s,String t){
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

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

    private static Boolean isValidAnagram(String s,String t){

        if (s.length()!=t.length()) return false;

        int[] counter=new int[26];

        for (int i=0;i<s.length();i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int c:counter){
            System.out.print(c+" ");
            if (c!=0){
                return false;
            }

        }
       return true;
    }
}
