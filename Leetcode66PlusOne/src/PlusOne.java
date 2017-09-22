import java.util.Arrays;

/* An integer is stored in an int array in the following order: 
 * the most significant bit is in digits [0], the lowest bit is in digits [n-1]  
 For example: 98, store as: digits [0] = 9; digits [1] = 8;  
 Solve the problem: starting from the last bit of the array plus 1, 
 need to consider the carry, if the digits [0] bit still have a carry 
 after the existence of, then the carry plus */

public class PlusOne {
	public static void main(String[] args){
		int[] input = {1,9,9};
		int[] result = plusOneDemo(input);
		System.out.println(Arrays.toString(result));
	}

	public static int[] plusOneDemo(int[] digits){
		int carry = 1;

		for(int i = digits.length-1; i >=0; i-- ){
			int sum = digits[i] + carry;

			if(sum >= 10 ){
				carry = 1;
			}
			else{
				carry = 0;
			}
			digits[i] = sum%10;

		}

		if(carry == 1){
			int[] result = new int[digits.length+1];
			result[0] = 1;
			System.arraycopy(digits, 0, result, 1, digits.length);

			return result;
		}

		return digits;

	}
}
