/*Given an unsorted array, find second largest element in the array in o(nlogn) time*/

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args){
		int[] arr = {8,5,6,1,4,2};
		int secondLargest = findSecondLargest(arr);
		System.out.println("second largest Number = "+secondLargest);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int findSecondLargest(int[] arr){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i< arr.length; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondLargest){
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;		
	}
}
