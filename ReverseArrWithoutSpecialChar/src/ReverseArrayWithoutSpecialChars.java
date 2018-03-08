//Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), 
//reverse the string in a way that special characters are not affected.

import java.util.*;
public class ReverseArrayWithoutSpecialChars {

	public static void main(String[] args){
        System.out.println("Reverse String");
        String str = "a!!!b.c.d,e'f,ghi";
        
        if(str != null || str.length()!= 0){
        	char[] arr = str.toCharArray();
        	System.out.println("Char Array = "+Arrays.toString(arr));
        	reverseArray(arr);
        }
}
	//method to reverse Array
    public static void reverseArray(char[] arr){
        System.out.println("inside Reverse String");
        int l = 0;
        int r = arr.length-1;

        while(l < r){
            System.out.println("inside while");

            if(Character.isLetter(arr[l]) && Character.isLetter(arr[r])){
                //swap chars
                arr = swapChar(arr, l, r);
                l++;
                r--;
            }//if loop
            
            else if(!Character.isLetter(arr[l])){
                l++;
            }//else if
            
            else if(!Character.isLetter(arr[r])){
                r--;
            }//else if
        }//while
        System.out.println("Rev Array = "+Arrays.toString(arr));
}//reverse method

static char[] swapChar(char[] arr, int l, int r){
    System.out.println("inside swap");
    
    char temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    
    System.out.println("Swap Array = "+Arrays.toString(arr));
    return arr;
}
}//class