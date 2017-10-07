/* Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). 
However, you may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again). 

Complexity Analysis

Time complexity : O(n)O(n). Single pass.

Space complexity: O(1)O(1). Constant space needed.
*/

public class BestTimeBuySellStock {
	public static void main(String[] args){
		int[] nums = {1,4,2, 7, 9};
		int profit = findProfit(nums);
		System.out.println(profit);
	}
	
	public static int findProfit(int[] nums){
		int profit  = 0;
		for(int i = 1; i<nums.length; i++){
			
			if(nums[i] > nums[i-1]){
				profit = profit + nums[i] - nums[i-1];
			}
		}
		return profit;
	}
	
	
}
