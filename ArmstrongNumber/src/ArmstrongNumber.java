//Armstrong number is a number that is equal to the sum of cubes of its digits
public class ArmstrongNumber {
	public static void main(String[] args){
		int num = 153;
		
		System.out.println("Is "+num+" an armstrong number? "+isArmstrongNum(num));
	}
	
	public static boolean isArmstrongNum(int num){
		int input = num;
		int sum = 0;
		while(num > 0){
			int d = num%10;
			sum = sum+(d*d*d);
			num = num/10;
		}
		
		if(sum == input){
			return true;
		}
		return false;
	}
}
