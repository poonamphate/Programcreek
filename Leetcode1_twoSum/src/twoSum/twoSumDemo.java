/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. */


package twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumDemo {
	public static void main(String[] args){
		int[] arr = {2, 7, 11, 15};

		int target = 9;

		int[] resultArr = twoSum(arr, target);
		System.out.println(Arrays.toString(resultArr));
	}

	public static int[] twoSum(int[] arr, int target){	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<arr.length; i++){
			map.put(arr[i], i);
		}

		for(int i = 0; i<arr.length; i++){
			if (map.containsKey(target - arr[i])){

				return new int[]{map.get(target - arr[i]), i};
			}

		}
		throw new IllegalArgumentException("No two sum solution"); 
	}
}
