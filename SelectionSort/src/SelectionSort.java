//Selection sort - time complexity O(n*n)

public class SelectionSort {
public static void main(String[] args){
	int[] arr = {9, 4, 7, 6, 3, 2};
	
	SelectionSort ss = new SelectionSort();
	System.out.println("Array before selection sort");
	ss.printArr(arr);
	ss.sort(arr);
	System.out.println("\nArray after selection sort");
	ss.printArr(arr);
}

public void sort(int[] arr){
	int n = arr.length;
	
	for(int i = 0; i<n-1; i++){
		int minIndex = i;
		for(int j = i+1; j<n; j++){
			if(arr[j]<arr[i]){
				minIndex = j;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = temp;
	}
}

public void printArr(int[] arr){
	for(int i = 0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
}
}
