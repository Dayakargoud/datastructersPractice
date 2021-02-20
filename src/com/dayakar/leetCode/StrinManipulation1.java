package com.dayakar.leetCode;

import java.util.Scanner;

public class StrinManipulation1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases=s.nextInt();
        s.nextLine();
        String[] inputs=new String[testCases];

        for(int i=0;i<testCases;i++){
            inputs[i]=s.nextLine();

        }

        for (int j=0;j<inputs.length;j++){

            String string=inputs[j].replaceAll(" ","");

            System.out.println(string);

            int ch1=Integer.valueOf(string.charAt(string.length()-2));
            int ch2=Integer.valueOf(string.charAt(string.length()-1));

            String fstr=string.substring(0,string.length()-2).replace(string.charAt(ch1),string.charAt(ch2));
            fstr=string.substring(0,string.length()-2).replace(string.charAt(ch2),string.charAt(ch1));

            System.out.println(fstr);



        }
    }
}
