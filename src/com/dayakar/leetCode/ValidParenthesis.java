package com.dayakar.leetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    private HashMap<Character,Character> mappings;

   public ValidParenthesis(){
           this.mappings=new HashMap<>();
           this.mappings.put(')','(');
       this.mappings.put('}','{');
       this.mappings.put(']','[');

    }

    public static void main(String[] args) {
        ValidParenthesis obj=new ValidParenthesis();

        String s="((()))";
        System.out.println(obj.isValid(s));

    }

    public  boolean isValid(String s) {
         Stack<Character> stack=new Stack<>();

         for (int i=0;i<s.length();i++){

             char c=s.charAt(i);
             if (this.mappings.containsKey(c)){

                 char top=stack.isEmpty()?'#':stack.pop();
                 if (top != this.mappings.get(c)) return false;

             }else {
                 stack.push(c);
             }
         }
         return stack.isEmpty();
    }
}
