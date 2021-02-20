package com.dayakar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharactersInString {

    public static void main(String[] args){
        Map<Character,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String name=sc.nextLine();
        boolean flag=true;
        char a;

      for(Character c:name.toCharArray()){
          if (map.containsKey(c)){
              flag=false;
              a=c;
              break;
          }else {
              map.put(c,1);

          }
      }
      if (flag){
          System.out.println(" unique");
      }else System.out.println("Not unique");

    }
}
