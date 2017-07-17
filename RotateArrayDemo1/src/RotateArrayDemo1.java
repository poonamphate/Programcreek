import java.util.*;

public class RotateArrayDemo1 {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int length = scanner.nextInt();
	int k = scanner.nextInt();
	int[] arr = new int[length];
	for(int i = 0; i < length; i++){
		arr[i] = scanner.nextInt();
	}
	
	System.out.println("input array : "+Arrays.toString(arr));
	
	rotateArray(length, k, arr);
	
	
 }

public static void rotateArray(int n, int k, int[] arr ){
	int[] result = new int[n];
	for(int i = 0; i<k; i++ ){
		result[i] = arr[n-k+i];
	}
	
	System.out.println(Arrays.toString(result));
	
	int j = 0;
	for(int i = k; i<n; i++){
		result[i] = arr[j];
		j++;
	}
	
	System.out.println(Arrays.toString(result));
	
	System.arraycopy(result, 0, arr, 0, n);
	System.out.println("rotated Array : "+Arrays.toString(arr));
}
}
