
public class ConvertIntToBinary {
	public static void main(String[] args){
		int num = 10;
		intToBinary(num);
	}
	
	public static void intToBinary(int num){
		int[] result = new int[10];
		int index = 0;
		while(num > 0){
			result[index] = num%2;
			index++;
			num = num/2;
			
		}
		
		for(int i = index-1; i >=0; i--){
			System.out.print(result[i]);
		}
	}
}
