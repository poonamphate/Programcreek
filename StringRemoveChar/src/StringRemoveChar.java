
public class StringRemoveChar {
	public static void main(String[] args){
		String str = "ABCD";
		char c = 'C';
		String result1 = removeCharI(str, c);
		String result2 = removeCharII(str, c);
		System.out.println(result1);
		//System.out.println(result2);
	}
	
	public static String removeCharI(String str, char letter){
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i< str.length(); i++){
			if(str.charAt(i)!=letter){
				sb.append(str.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static String removeCharII(String str, char letter){
		int index = str.indexOf(letter);
		if(index==-1){
			return str;
		}
		return str.substring(0, index)+str.substring(index+1, str.length());
		
		
	}
}
