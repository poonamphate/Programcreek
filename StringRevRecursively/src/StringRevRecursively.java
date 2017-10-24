
public class StringRevRecursively {
	public static void main(String[] args){
		String str = "abcd";
		System.out.println("origibnal string = "+str);
		String reverseString = revRecursively(str);
		System.out.println("reverse string recursively = "+reverseString);
		
		String result = revIteratively(str);
		System.out.println("reverse string iteratively = "+result);
	}
	
	public static String revRecursively(String str){
		if(str.length()<2){
			return str;
		}
		
		return revRecursively(str.substring(1))+str.charAt(0);
		
	}
	
	public static String revIteratively(String str){
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1; i>=0; i--){
			sb = sb.append(arr[i]);
		}
		return sb.toString();
	}
}
