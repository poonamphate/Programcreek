/*Rotate an array of n elements to the right by k steps without using arraycopy()
 Time complexity is O(n*k)*/
import java.util.*;

public class RotateArrayDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//length of array
		int k = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = scanner.nextInt();
		}
		
		int temp[] = new int[n];
		for(int i = 0; i< k; i++){
			for(int j = n-1; j>0; j-- ){
				temp[j] = arr[j];
				arr[j] = arr[j-1];
				arr[j - 1] = temp[j];
			}
		}
		
		System.out.println("rotated array : "+Arrays.toString(arr));
	}

}
