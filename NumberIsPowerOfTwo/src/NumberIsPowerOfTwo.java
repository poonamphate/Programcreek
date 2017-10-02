// check if number is power of two
public class NumberIsPowerOfTwo {
	public static void main(String[] args){
		int num = 06;
		
		System.out.println("Is "+num+" power of two: "+powerOfTwo(num));
	}
	
	public static boolean powerOfTwo(int num){
		if(num <=1){
			return false;
		}
		
		while(num%2 == 0){
			num = num/2;
		}
		
		if(num == 1){
			return true;
		}
		else{
			return false;
		}
	}
}
