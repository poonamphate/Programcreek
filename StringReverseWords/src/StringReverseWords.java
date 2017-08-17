
public class StringReverseWords {
public static void main(String[] args){
	String str = "My name is Poonam";
	
	String[] arr = str.split(" ");
	
	for(int i = 0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println("");
	
	StringBuilder sb = new StringBuilder();
	
	for(int i = arr.length-1; i>=0; i--)
		sb.append(arr[i] + " ");
		
		String result = sb.toString();
		System.out.print(result.substring(0, result.length()-1));
}
}
