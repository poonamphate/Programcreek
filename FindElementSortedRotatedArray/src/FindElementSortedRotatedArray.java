
class FindElementSortedRotatedArray {
	public static void main(String[] args){
		int[] arr = {5, 6, 7, 1, 2, 3, 4};
		System.out.println("start");
		int index = findIndex(arr, 7);
		System.out.println("index = "+index);
	}
	
	static int findIndex(int[] arr, int k){
		if(arr == null || arr.length == 0){
			return -1;
		}
		
		int pivot = findPivot(arr);
		System.out.println("pivot = "+pivot);
		
		if(pivot > 0 && k >= arr[0] && k <= arr[pivot - 1] ){
			return binarySearch(arr, k, 0, pivot - 1);
		}
		else{
			return binarySearch(arr, k, pivot, arr.length - 1);
		}
		
		
	}
	
	static int binarySearch(int[] arr, int k, int start, int end){
		while(start <= end){
			int mid = (start + end)/2;
			if(k == arr[mid]){
				return mid;
			}
			else if(k <= arr[mid]){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		return -1;
	}
	
	static int findPivot(int[] arr){
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid] > arr[mid+1]){
				return mid + 1;
			}
			else if(arr[start] <= arr[mid] ){
				start = mid+1;
			}
			else{
				end = mid - 1;
			}
		}
		return -1;
	}
}
