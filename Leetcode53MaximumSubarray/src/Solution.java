//https://www.programcreek.com/2013/02/leetcode-maximum-subarray-java/
//time and space complexity is O(1)
import java.util.Arrays;

public class Solution {
	public static void main(String[] args){
		int[] input = {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum = maxSubArray(input);
		System.out.println("max sum is : "+ sum);
	}
	
	public static int maxSubArray(int[] A){
		int max = A[0];
		int newSum = A[0];
		
		for(int i = 1; i<A.length; i++){
			newSum = Math.max(newSum+A[i], A[i]);
			max = Math.max(max, newSum);
		}
			
		return max;
	}
}
