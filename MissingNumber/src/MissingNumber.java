/*You are given an integer array containing 1 to n but one of the number 
 from 1 to n in the array is missing. You need to provide optimum solution 
 to find the missing number. Number can not be repeated in the array.*/

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args){
		int[] arr = {7,5,6,1,4,2};
		System.out.println(Arrays.toString(arr));
		
		int missingNum = findMissingNum(arr);
		System.out.println(missingNum);
	}
	
	public static int findMissingNum(int[] arr){
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum+=arr[i];
		}
		
		int n = arr.length+1;
		int expectedSum = n*(n+1)/2;
		
		return expectedSum - sum;
	}
}
