/*Find first non repeated char in a string*/

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringNonRepeatedChar {

	public static void main(String[] args) {
		String str = "poonam";
		char result = findChar(str);
		System.out.println(result);
	}
	
	public static char findChar(String str){
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char c: arr){
			map.put(c, map.containsKey(c)? map.get(c)+1 : 1);
		}
		System.out.println(Arrays.asList(map));
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue() == 1){
				return entry.getKey();
			}
		}
		throw new RuntimeException("no non repeated char");
	}

}
