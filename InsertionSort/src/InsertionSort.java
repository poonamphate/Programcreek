/*Time complexity for insertion sort is O(n*n)
 Insertion sort is used when number of elements are small*/
public class InsertionSort {
public static void main(String[] args){
	int[] arr = {10, 5, 7, 2, 9};
	
	InsertionSort is = new InsertionSort();
	System.out.println("Array before sorting");
	is.printArr(arr);
	is.sorting(arr);
	System.out.println("\nArray after sorting");
	is.printArr(arr);
	}

  public void printArr(int[] arr){
	  int size = arr.length;
	  
	  for(int i = 0; i<size; i++){
		  System.out.print(arr[i]+" ");
	  }
  }
  
  public void sorting(int[ ] arr){
	  int size = arr.length;
	  
	  for(int i = 1; i< size; i++){
		  int key = arr[i];
		  int j = i-1;
		  
		  while(j>=0 && arr[j]> key){
			  arr[j+1] = arr[j];
			  j = j-1;
		  }
		  
		  arr[j+1]=key;
	  }
  }
}
