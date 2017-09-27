/*Count the occurrence of given character in a string*/
public class StringOccurrenceOfChar {

	public static void main(String[] args) {
		String str = "Poonam";
		char target = 'o';
		int result = findChar(str, target);
		System.out.println("Character "+target+" occurred "+result+" times.");
	}
	
	public static int findChar(String str, char target){
		char[] arr = str.toCharArray();
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			if(target == arr[i]){
				count++;
				
			}
		}
		
		return count;
	}

}
