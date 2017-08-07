//time complexity of Bubble sort is O(n*n)

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args){
	int[] arr = {10, 9, 7, 5, 4, 2 , 1};
	
	BubbleSort bs = new BubbleSort();
	System.out.println("array before bubblesort");
	bs.printArray(arr);
	bs.sort(arr);
	System.out.println("\narray after bubblesort");
	bs.printArray(arr);
}

public void printArray(int[] arr){
	for(int i = 0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
}

public void sort(int[] arr){
	System.out.println("\nsorting");
	for(int i = 0; i < arr.length-1; i++){
		for(int j = 0; j < arr.length-i-1; j++){
			if(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			
			System.out.println(Arrays.toString(arr));
		}
	}
}

}
