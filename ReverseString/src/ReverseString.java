//Reverse a string using recursion and iteration
public class ReverseString {

   public static void main(String []args) {
      String str = "my name is Poonam";
      
      String reverseString = reverseR(str);
      //System.out.println(reverseString);
      
      String revString = reverse(str);
      System.out.println(revString);
   }
   
   public static String reverseR(String str){
       //System.out.println(str);
       
       if(str.length() < 2){
            return str;
       }
       
       return reverseR(str.substring(1)) + str.charAt(0);
   }
   
   public static String reverse(String str){
	   StringBuilder sb = new StringBuilder();
	   char[] charArr = str.toCharArray();
	   for(int i = charArr.length-1; i >=0; i-- ){
		   sb.append(charArr[i]);
	   }
	   return sb.toString();
   }
} 