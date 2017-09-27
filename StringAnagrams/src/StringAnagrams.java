/*Check if two strings are anagrams.
 An anagram of a string is another string that contains same characters, 
 only the order of characters can be different.
 For example, “abcd” and “dabc” are anagram of each other.*/

import java.util.*;

public class StringAnagrams {

   public static void main(String []args) {
      String str1 = "poonam";
      String str2 = "onamop";
      boolean result = anagrams(str1, str2);
      System.out.println(result);
   }
   
   public static boolean anagrams(String str1, String str2){
       char[] arr = str1.toCharArray();
       
       for(char c: arr){
           int index = str2.indexOf(c);
           //System.out.println("index = "+index);
           //System.out.println(" char = "+c);
           if(index == -1){
               return false;
           }
       }
       return true;
   }
} 