/* Write a program to print all permutations of a given string*/
public class StringAllPermutation {

	public static void main(String[] args) {
		String str = "ABC";
		int l = 0;
		int r = str.length()-1;
		allPermutations(str, l, r);
	}

	public static void allPermutations(String str, int l, int r){
		if(l==r){
			System.out.println(str);
		}
		else{
			for(int i = l; i<=r; i++){
				str = swap(str, l, i);
				allPermutations(str, l+1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String str, int i, int j){
		char[] arr = str.toCharArray();

		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

}
