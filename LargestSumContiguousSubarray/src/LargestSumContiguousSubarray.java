
public class LargestSumContiguousSubarray {
	public static void main(String[] args){
	int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
	int sum = findLargestSum(arr);
	System.out.println("Largest sum is: "+sum);
	}
	
	static int findLargestSum(int[] arr){
		if(arr.length == 0){
			throw new IllegalArgumentException();
		}
		
		int maxSum = 0;
		int currentSum = 0;
		
		for(int i = 0; i<arr.length; i++){
			currentSum += arr[i];
			
			if(currentSum > maxSum){
				maxSum = currentSum;
			}
			
			if(currentSum < 0){
				currentSum = 0;
			}
		}
		return maxSum;
	}
	
	
	
	
}
