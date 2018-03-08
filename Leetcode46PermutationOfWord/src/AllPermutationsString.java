	import java.util.HashSet;
	
	 
	public class AllPermutationsString {
	    
	    public static HashSet<String> getAllPermutations(String str) {
	         
	        HashSet<String> permutations = new HashSet<String>();
        
	        if(str == null || str.length() == 0) {
	            permutations.add("" );
	            return permutations;
	        }
	        
	        char first = str.charAt(0);
	        //System.out.println("first char = "+first);
	        
	        String remainingString = str.substring(1);
	        HashSet<String> words = getAllPermutations(remainingString);
	        
	        for(String word: words) {
	            for(int i = 0; i <= word.length(); i++) {
	            	//System.out.println("i = "+i);
	                String prefix = word.substring(0, i);
	                //System.out.println("prefix = "+prefix);
	                String suffix = word.substring(i);
	                //System.out.println("suffix = "+suffix);
	                permutations.add(prefix + first + suffix);
	                //System.out.println("permutations = "+permutations);
	            }
	        }
	        return permutations;
	    }
	    
	    public static void main(String[] args) {
	        String str = "abcd" ;
	        HashSet<String> permutations = getAllPermutations(str);
	        System.out.println(permutations.toString());
	    }
	}